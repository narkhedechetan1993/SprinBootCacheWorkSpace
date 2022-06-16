package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class Controller {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(path = "/addEmployee", method = RequestMethod.POST)
	public Employee addEmplyoee(@RequestBody Employee emp) {
		return employeeService.addEmployee(emp);
	}

	@RequestMapping(path = "/getEmployeeId", method = RequestMethod.GET)
	public Optional<Employee> getByEmployeeId(@RequestParam String emp_id) {
		System.out.println(emp_id);
		return employeeService.getByEmployeeId(emp_id);

	}

	@RequestMapping(path = "/deleteEmployeeId", method = RequestMethod.DELETE)
	public void deleteByEmployeeId(@RequestParam String emp_id) {
		employeeService.deleteByEmployeeId(emp_id);

	}
	
	@RequestMapping(path="/updateEmployee" , method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
		
	}
	@RequestMapping(path="/patchEmployee" , method = RequestMethod.PATCH)
	public Employee patchEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
		
	}

}
