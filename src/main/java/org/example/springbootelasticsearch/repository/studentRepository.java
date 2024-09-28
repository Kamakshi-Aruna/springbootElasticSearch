package org.example.springbootelasticsearch.repository;

import org.example.springbootelasticsearch.model.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface studentRepository extends ElasticsearchRepository<Student, Integer> {

    List<Student> findByName(String name);
}
