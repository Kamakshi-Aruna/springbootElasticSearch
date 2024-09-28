package org.example.springbootelasticsearch.controller;

import org.example.springbootelasticsearch.model.Student;
import org.example.springbootelasticsearch.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class studentController {

    @Autowired
    studentService service;

//    Adding the student details
    @PostMapping
    public String saveStudent(@RequestBody Student student) {
        service.addStudent(student);
        return "Data Inserted Successfully!!";
    }

//    Get the all the student Details
    @GetMapping
    public Iterable<Student> getAllStudents() {
       return  service.getAllStudents();
    }

//    Deleting the student using id
    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable int id) {
        service.deleteStudent(id);
        return "Data Deleted!!";
    }

//    Search the student details using student_name
    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam("name") String name) {
        return service.searchByName(name);
    }
}
