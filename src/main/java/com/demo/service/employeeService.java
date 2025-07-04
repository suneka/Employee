package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.demo.dao.employeeDao;
import com.demo.entity.employeeEntity;

@Service
public class employeeService {
	@Autowired
	employeeDao ed;
	public String getEmpa(List<employeeEntity> e) {
		return ed.value(e);
	}
	public List<employeeEntity>getdata(){
		return ed.data();
	}
	public List<String> getnames() {
		return ed.printNames();
	}
	public employeeEntity getById(int a) {
		return ed.byId(a);
	}
	public String deleteId(int a) {
		return ed.deleteI(a);
	}
	public String putValues(int a, employeeEntity e1) {
		return ed.printValue(a, e1);
	}
	public String patchValues(int a, employeeEntity e1) {
		return ed.editValue(a,e1);
	}
	
}
