package com.gcu.activityCST323.repository;

//My name is Daniel Rumfelt and this program was written by me for the purpose for class activities in CST323.
//Grand Canyon University 11/05/2023

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcu.activityCST323.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}