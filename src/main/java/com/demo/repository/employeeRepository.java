package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.employeeEntity;

public interface employeeRepository extends JpaRepository<employeeEntity,Integer>{

}	
