package org.example.springbootelasticsearch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "students")
@Data
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    private String email;
}
