package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee addEmployee(Employee emp) {
		return employeeDao.save(emp);
	}

	public Optional<Employee> getByEmployeeId(String emp_id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(Integer.parseInt(emp_id));
	}

	public void deleteByEmployeeId(String emp_id) {
		// TODO Auto-generated method stub
		 employeeDao.deleteById(Integer.parseInt(emp_id));
	}

	public Employee updateEmployee(Employee emp) {
		
		return employeeDao.save(emp);
	}

}
