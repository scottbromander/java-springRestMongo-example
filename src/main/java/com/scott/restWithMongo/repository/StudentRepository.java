package com.scott.restWithMongo.repository;

import com.scott.restWithMongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student, String> {

}
