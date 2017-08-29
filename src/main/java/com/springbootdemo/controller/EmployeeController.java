package com.springbootdemo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springbootdemo.dao.EmployeeDAORepository;
import com.springbootdemo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeDAORepository employeeDAORepository;
	
	@RequestMapping("/index")
	public String index(){
		return "Hi Employee";
	}
	
	@RequestMapping("/all")
	public String getall(){
		List<Employee> list = employeeDAORepository.findAll();
		StringBuilder sb = new StringBuilder();
		sb.append("Found "+list.size()+"<br/>");
		for(Employee e : list){
			sb.append(e.getName()+" "+e.getAge()+"yrs");
		}
		return sb.toString();
	}
	
	@RequestMapping("/byname/{nameVal}")
	public String getByName(@PathVariable String nameVal){
		Employee e = employeeDAORepository.findByName(nameVal);
		if(e != null){
			return e.getName()+":"+e.getAge();
		}else{
			return "No records found";
		}
	}
	
	@RequestMapping("/test")
	public String testMethod(@RequestParam("namevar") String name, @RequestParam("filevar")MultipartFile file){
		System.out.println(name+"........................");
		System.out.println(file.getName()+":"+file.getContentType()+":"+file.getOriginalFilename()+":"+file.getSize());
		return "tyest";
	}

}
