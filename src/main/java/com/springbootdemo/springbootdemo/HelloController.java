package com.springbootdemo.springbootdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/index")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/emp")
	public String empDetails() {
		Employee emp = new Employee();
		emp.setFirstName("Abhijit");emp.setLastName("Samantaray");emp.setAge(29);emp.setDepartmentName("Tech");
		Gson gson = new Gson();
		
		return gson.toJson(emp);
	}
	
	@RequestMapping("/emplist")
	public String empDetailList() {
		Employee emp1 = new Employee();
		emp1.setFirstName("Abhijit");emp1.setLastName("Samantaray");emp1.setAge(29);emp1.setDepartmentName("Tech");
		Employee emp2 = new Employee();
		emp2.setFirstName("Ab");emp2.setLastName("S");emp2.setAge(29);emp2.setDepartmentName("Technology");
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		Gson gson = new Gson();
		
		return gson.toJson(list);
	}

}
