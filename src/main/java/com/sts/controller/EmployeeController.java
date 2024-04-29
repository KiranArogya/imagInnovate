package com.sts.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.model.Employee;
import com.sts.repository.EmployeeRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/EmpApi")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("/employees")
	public String createNewEmployee(@RequestBody Employee employee) {
		System.out.println("Received Employee: " + employee);
		employeeRepository.save(employee);
		return "Employee created in the database";
	}

	@GetMapping("/employeesTax")
	public ResponseEntity<List<Employee>> getAllEmployeesTax() {
		List<Employee> empList = new ArrayList<>();
		
		employeeRepository.findAll().forEach(calculateTax(sal));
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}
	
	public double calculateTax(double yearlySalary) {
	    if (yearlySalary <= 250000) {
	        return 0; // No tax
	    } else if (yearlySalary <= 500000) {
	        return 0.05 * (yearlySalary - 250000);
	    } else if (yearlySalary <= 1000000) {
	        return 0.10 * (yearlySalary - 500000) + 12500; 
	    } else {
	        return 0.20 * (yearlySalary - 1000000) + 112500; 
	    }
	}

	
}



