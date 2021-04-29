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
	public void save(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		String sql = "insert into employee_details (id,name,designation,salary,age,doj) values (?,?,?,?,?,?)";
		this.jdbcTemplate.update(sql,employeeDTO.getId(),employeeDTO.getName(),employeeDTO.getDesignation(),employeeDTO.getSalary(),employeeDTO.getAge(),employeeDTO.getDoj());
	}

	@Override
	public EmployeeDTO get(Long id) {
		String sql = "select * from employee_details where id = ?";
		return (EmployeeDTO) this.jdbcTemplate.queryForObject(sql,new Object[] {id},new BeanPropertyRowMapper(EmployeeDTO.class));		
	}

	@Override
	public void delete(Long id) {		
		String sql = "delete from employee_details where id = ?";
		this.jdbcTemplate.update(sql,new Object[] {id});
	}

	@Override
	public void update(EmployeeDTO employeeDTO) {		
		String sql = "update employee_details set name=?,designation=?,salary=?,age=?,doj=? where id = ?";
		this.jdbcTemplate.update(sql,employeeDTO.getName(),employeeDTO.getDesignation(),employeeDTO.getSalary(),employeeDTO.getAge(),employeeDTO.getDoj(),employeeDTO.getId());
		
	}

	@Override
	public List<EmployeeDTO> list() {
		String sql="select * from employee_details";
		return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper(EmployeeDTO.class));		
	}

}
