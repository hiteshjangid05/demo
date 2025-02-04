package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;

  List<Employee> getEmployee(){
    return (List<Employee>) employeeRepository.findAll();
  }
}
