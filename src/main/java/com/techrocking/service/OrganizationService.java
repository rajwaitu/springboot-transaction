package com.techrocking.service;

import com.techrocking.model.Employee;
import com.techrocking.model.EmployeeHealthInsurance;

public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
