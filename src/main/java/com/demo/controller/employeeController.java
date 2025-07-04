package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.employeeEntity;
import com.demo.service.employeeService;

@RestController
@RequestMapping(value="/getDetails")
public class employeeController {
@Autowired
employeeService es;
@PostMapping(value="/getEmployee")
	public String getEmp(@RequestBody List<employeeEntity> e) {
		return es.getEmpa(e);
	}
@GetMapping(value="/getdata")
	public List<employeeEntity> getData(){
		return es.getdata();
	}
@GetMapping(value="/getnames")
	public List<String> getAllNames(){
		return es.getnames();
	}
@GetMapping(value="/getById/{a}")
	public employeeEntity getbyId(@PathVariable int a) {
		return es.getById(a);
	}
@DeleteMapping(value="/deleteId/{a}")
	public String deletebyId(@PathVariable int a) {
		return es.deleteId(a);
	}
@PutMapping(value="/putvalues/{a}")
	public String PutValues(@PathVariable int a, @RequestBody employeeEntity e1) {
		return es.putValues(a, e1);
	}
@PatchMapping(value="/patchvalues/{a}")
	public String PatchValues(@PathVariable int a, @RequestBody employeeEntity e1) {
		return es.patchValues(a, e1);
	}
@GetMapping("/print")
public String geta() {
	return "Print";
}
@GetMapping("/path")
public String getb() {
	return "Print A";
}
@GetMapping("/path1")
public String getc() {
	return "Print B";
}
}

