package com.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springbootdemo.model.Employee;

@Component
@Repository
public interface EmployeeDAORepository extends JpaRepository<Employee, Long>{
	
	Employee findByName(String name);

}
