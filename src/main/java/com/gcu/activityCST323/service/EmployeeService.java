package com.gcu.activityCST323.service;

import java.util.List;

import com.gcu.activityCST323.model.Employee;

//My name is Daniel Rumfelt and this program was written by me for the purpose for class activities in CST323.
//Grand Canyon University 11/05/2023

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}