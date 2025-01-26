package com.example.demo.student;

import java.time.LocalDate;
import java.util.Date;

public class Student {
  private  Integer rollNo;
  private String name;
  private Integer age;
  private LocalDate DOB;

  public Student() {
  }

  public Student updateStudent(Student student){
    this.name=student.getName();
    this.age=student.getAge();
    this.DOB=student.getDOB();
    return this;
  }
  public Student(Integer rollNo,String name, Integer age, LocalDate DOB) {
    this.rollNo = rollNo;
    this.name = name;
    this.age = age;
    this.DOB = DOB;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public LocalDate getDOB() {
    return DOB;
  }

  public void setDOB(LocalDate DOB) {
    this.DOB = DOB;
  }

  public Integer getRollNo() {
    return rollNo;
  }

  public void setRollNo(Integer rollNo) {
    this.rollNo = rollNo;
  }

  @Override
  public String toString() {
    return "Student{" +
            "rollNo=" + rollNo +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", DOB=" + DOB +
            '}';
  }
}
