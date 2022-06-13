package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;

@RestController
public class Controller {

	@RequestMapping(path = "/registration_page", method = RequestMethod.GET)
	public ModelAndView registration_page(ModelAndView mv) {
		System.out.println("Here.....................");
		mv.setViewName("registration_page");
		return mv;
	}

	@RequestMapping(path = "/addEmployee", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addEmplyoee(@RequestParam(name="emp_name") String emp_name1) {
		System.out.println(emp_name1);
		return "success";
	}

	@RequestMapping(path = "/addEmployeeJson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addEmployeeJson(@RequestBody Employee emp) {
		System.out.println("abcd.............");
		System.out.println(emp.getEmp_mobile());
		System.out.println(emp.getEmp_email());
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getEmp_username());
		System.out.println(emp.getEmp_password());
		return "success";
	}

}
