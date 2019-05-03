package com.scott.restWithMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

    @Id
    private String id;

    private String name;

    //CONSTRUCTORS
    protected Student(){}

    public Student(String name) {
        this.name = name;
    }

    //GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student Class - Name: " + this.name + " - ID: " + this.id;
    }
}
