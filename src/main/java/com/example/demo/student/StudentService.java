package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
  List<Student> studentList= new ArrayList<>(Arrays.asList(new Student(1,"A",20, LocalDate.of(2005, Month.APRIL,5)),new Student(2,"B",20,LocalDate.of(2005, Month.APRIL,5)),new Student(3,"C",30,LocalDate.of(2005, Month.APRIL,5))));
  public List<Student> getStudent(){
    return this.studentList;
  }

  public Optional<Student> getStudentById(Integer rollNo){
    Optional<Student> student = studentList.stream().filter(stu->stu.getRollNo().equals(rollNo)).findFirst();
    return student;
  }
  public List<Student> addStudent(Student student){
    studentList.add(student);
    return this.studentList;
  }

  public Optional<Student> updateStuddent(Integer id, Student student){
    if(studentList.stream().filter(student1 -> student.getRollNo().equals(id)).findAny().isEmpty()){
      return null;
    }
    else{
      Optional<Student> studen = studentList.stream().filter(student1 -> student.getRollNo().equals(id)).findFirst();
      studen.get().updateStudent(student);
      return studen;
    }
  }
   public List<Student> deleteStudent(Integer id) {
     if (studentList.stream().anyMatch(stu -> stu.getRollNo().equals(id))) {
       studentList.removeFirst().getRollNo().equals(id);
     }
     return studentList;
   }
}

