package com.techrocking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techrocking.model.Employee;
import com.techrocking.model.EmployeeHealthInsurance;
import com.techrocking.service.EmployeeService;
import com.techrocking.service.HealthInsuranceService;
import com.techrocking.service.OrganizationService;

@Service
public class OrganzationServiceImpl implements OrganizationService {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	HealthInsuranceService healthInsuranceService;

	@Override
	@Transactional
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		employeeService.insertEmployee(employee);
		if (employee.getEmpId().equals("emp1")) {
			throw new RuntimeException("thowing exception to test transaction rollback");
		}
		healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}

	@Override
	@Transactional
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		employeeService.deleteEmployeeById(employee.getEmpId());
		healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance.getEmpId());
	}
}