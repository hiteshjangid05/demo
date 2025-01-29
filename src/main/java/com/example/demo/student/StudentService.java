package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;
  public List<Student> getStudent(){
    return (List<Student>) studentRepository.findAll();
  }

  public Optional<Student> getStudentById(Integer rollNo){
    return studentRepository.findById(rollNo);
  }
  public List<Student> addStudent(Student student){
    return Collections.singletonList(studentRepository.save(student));
  }

  public Optional<Student> updateStuddent(Integer id, Student student){
    if(studentRepository.findById(id).isPresent()){
      studentRepository.save(student);
    }
    return studentRepository.findById(id);
  }
   public List<Student> deleteStudent(Integer id) {
     if (studentRepository.findById(id).isPresent()) {
       studentRepository.deleteById(id);
     }
     return (List<Student>) studentRepository.findAll();
   }
}

