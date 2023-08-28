package com.project.Employee.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Employee.Repository.EmployeeRepository;
import com.project.Employee.entity.EmployeeEntity;
import com.project.Employee.model.Employee;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class EmployeeServiceImple implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity =new EmployeeEntity();
		
		BeanUtils.copyProperties(employee, employeeEntity);
		employeeRepository.save(employeeEntity);
		return employee;
		
	}

}
