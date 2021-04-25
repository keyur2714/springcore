package com.webstack.springcore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webstack.springcore.dao.EmployeeDAO;
import com.webstack.springcore.dto.EmployeeDTO;
import com.webstack.springcore.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public void save(EmployeeDTO employeeDTO) {
		employeeDAO.save(employeeDTO);
	}

	@Override
	public EmployeeDTO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(EmployeeDTO type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeDTO> list() {
		// TODO Auto-generated method stub
		return employeeDAO.list();
	}

}
