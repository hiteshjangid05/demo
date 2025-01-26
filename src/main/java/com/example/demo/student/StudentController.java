package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/get")
  public List<Student> getStudentList() {
    return studentService.getStudent();
  }

  @GetMapping("/get/{id}")
  public Optional<Student> getStudentById(@PathVariable("id") Integer id){
    return studentService.getStudentById(id);
  }
  @PostMapping("/post")
  public List<Student> addStudent(@RequestBody Student student){
    return studentService.addStudent(student);
  }

  @PostMapping("/post/{id}")
  public Optional<Student> updateStudent(@PathVariable("id") Integer id,@RequestBody Student student){
    return studentService.updateStuddent(id,student);
  }

  @DeleteMapping("/delete/{id}")
  public List<Student> deleteStudent(@PathVariable("id") Integer id){
    return studentService.deleteStudent(id);
  }
}
