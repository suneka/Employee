package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.entity.employeeEntity;
import com.demo.repository.employeeRepository;

@Repository
public class employeeDao {
@Autowired
employeeRepository er;
	public String value(List<employeeEntity> e) {
		er.saveAll(e);
		return "Saved Successfully";
	}
	public List<employeeEntity>data(){
		return er.findAll();
	}
	public List<String>printNames(){
		return er.findAll().stream().map(x->x.getName()).collect(Collectors.toList());
	}
	public employeeEntity byId(int a) {
		return er.findById(a).orElse(null);
	}
	public String deleteI(int a) {
		er.deleteById(a);
		return "delete succesfully";
	}
	public String printValue(int a, employeeEntity e1) {
		employeeEntity e=er.findById(a).get();
		e.setName(e1.getName());
		e.setSalary(e1.getSalary());
		er.save(e);
		return "Updated Successfully";
	}
	public String editValue(int a, employeeEntity e1) {
		employeeEntity emp=er.findById(a).get();
		emp.setName(e1.getName());
		emp.setSalary(e1.getSalary());
		er.save(emp);
		return "Updated";
	}

}
