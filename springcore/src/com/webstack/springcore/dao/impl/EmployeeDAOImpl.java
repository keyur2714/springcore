package com.webstack.springcore.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webstack.springcore.dao.EmployeeDAO;
import com.webstack.springcore.dto.EmployeeDTO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void save(EmployeeDTO type) {
		// TODO Auto-generated method stub
		
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
		String sql="select * from employee_details";
		return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper(EmployeeDTO.class));		
	}

}
