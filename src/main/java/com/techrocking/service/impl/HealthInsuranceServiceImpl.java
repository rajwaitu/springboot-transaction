package com.techrocking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techrocking.dao.HealthInsuranceDao;
import com.techrocking.model.EmployeeHealthInsurance;
import com.techrocking.service.HealthInsuranceService;

@Service
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

	@Autowired
	HealthInsuranceDao healthInsuranceDao;

	@Override
	public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
		healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}

	@Override
	public void deleteEmployeeHealthInsuranceById(String empid) {
		healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
	}

}