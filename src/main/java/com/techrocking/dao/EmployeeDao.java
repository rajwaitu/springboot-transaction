package com.techrocking.dao;

import com.techrocking.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee cus);

	void deleteEmployeeById(String empid);
}