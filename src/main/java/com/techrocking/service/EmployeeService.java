package com.techrocking.service;

import com.techrocking.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);
}