package com.techrocking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techrocking.dao.EmployeeDao;
import com.techrocking.model.Employee;
import com.techrocking.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(String empid) {
		employeeDao.deleteEmployeeById(empid);
	}

}