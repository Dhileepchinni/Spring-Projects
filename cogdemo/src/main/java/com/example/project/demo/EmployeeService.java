package com.example.project.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.crud.jdbc.Item;

@Service
public class EmployeeService {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Item> select(Item item)
	{
		String sql="SELECT * FROM employee;";
     //  System.out.println("select");
		  return jdbcTemplate.query(
		              sql,
		              (rs,rowNum)->new Item(
		              rs.getInt(1),
		              rs.getString(2),
		              rs.getString(3),
		              rs.getInt(4)
		       )
		              );
		
		objectname.methodname(sql,(obj,rowNum)->new Employee)
	}
}
