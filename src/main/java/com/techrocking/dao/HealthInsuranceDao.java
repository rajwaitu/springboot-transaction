package com.techrocking.dao;

import com.techrocking.model.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);
}