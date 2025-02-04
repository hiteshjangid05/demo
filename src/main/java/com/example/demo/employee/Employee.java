package com.example.demo.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
  @Id
  private Integer employeeId;
  private String name;
  private String position;
  private Double salary;

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "employeeId=" + employeeId +
            ", name='" + name + '\'' +
            ", position='" + position + '\'' +
            ", salary=" + salary +
            '}';
  }
}
