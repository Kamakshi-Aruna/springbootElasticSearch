package org.example.springbootelasticsearch.service;

import org.example.springbootelasticsearch.model.Student;
import org.example.springbootelasticsearch.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    studentRepository repository;


    public void addStudent(Student student) {
         repository.save(student);
    }

    public Iterable<Student> getAllStudents() {
       return  repository.findAll();
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

    public List<Student> searchByName(String name) {
       return repository.findByName(name);
    }


}
