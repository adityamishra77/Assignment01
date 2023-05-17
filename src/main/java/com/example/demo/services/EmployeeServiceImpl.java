package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getEmployees() {
		return this.employeeRepo.findAll();
	}

	@Override
	public Employee getEmployee(long id) {
		return this.employeeRepo.getOne(id);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return this.employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return this.employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		Employee emp=this.employeeRepo.getOne(id);
		this.employeeRepo.delete(emp);
		
	}


	

}
