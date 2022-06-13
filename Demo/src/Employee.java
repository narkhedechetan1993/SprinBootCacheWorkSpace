import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
	
	// Getter and setter methods
	private int id;
	private String name;
	private int ctc;
	private String managerId;
	
		
	public Employee(int id, String name, int ctc, String managerId) {
		super();
		this.id = id;
		this.name = name;
		this.ctc = ctc;
		this.managerId = managerId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCtc() {
		return ctc;
	}
	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ctc=" + ctc + ", managerId=" + managerId + "]";
	}

	public static void main(String args[]) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Tom", 200000, "2"));
		empList.add(new Employee(2, "John", 300000, "4"));
		empList.add(new Employee(3, "Shaun", 250000, "2"));
		empList.add(new Employee(4, "Robert", 500000, "1"));
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (Employee employee : empList) {
			int mId = Integer.parseInt(employee.getManagerId());
			if(hm.containsKey(mId)){
				hm.put(mId, hm.get(mId)+1);
			}
			else {
				hm.put(mId, 1);
			}		
		}
		
		System.out.println(hm);
		
		
		// group employee based on manager id
		
		Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee :: getManagerId, Collectors.counting()));
		System.out.println(collect);
		
		// group employee based on manager id
		 Map<String, List<Employee>> collect2 = empList.stream().collect(Collectors.groupingBy(Employee :: getManagerId, Collectors.toList()));
		System.out.println(collect2);
		
		// group and calculate employee id addition based on manager id 
		Map<String, Integer> collect1 = empList.stream().collect(Collectors.groupingBy(Employee :: getManagerId, Collectors.summingInt(Employee :: getId)));
		System.out.println(collect1);
		
		// get total expenses
		int totalExpenses = empList.stream().collect(Collectors.summingInt(Employee :: getCtc));
		System.out.println("Total Expenses = " + totalExpenses);
		
		// get manager by employee name
		String empName = "Tom";
		Optional<Employee> findByEmpName = empList.stream().filter(emp -> emp.getName().equals(empName)).findFirst();
		System.out.println(empName + " manager id is " + findByEmpName.get().getManagerId());
		
		// get employee having highest salary
		Optional<Employee> secondHighestSalaryEmp = empList.stream().sorted(Comparator.comparingInt(Employee :: getCtc).reversed()).skip(1).findFirst();
		System.out.println("Employee having second highest salary = " + secondHighestSalaryEmp.get().getName());
		
		// sorted employees in ascending order based on salary
		List<Employee> sortedBySalaryInAscending = empList.stream().sorted(Comparator.comparingInt(Employee :: getCtc)).collect(Collectors.toList());
		System.out.println(sortedBySalaryInAscending.toString());
		
		// sorted employees in descending order based on employee name
		List<Employee> sortedByNameInDescending = empList.stream().sorted((emp1, emp2) -> emp2.getName().compareTo(emp1.getName())).collect(Collectors.toList());
		System.out.println(sortedByNameInDescending.toString());
		
		System.out.println("Original list = " + empList.toString());
	}
	
	
}
