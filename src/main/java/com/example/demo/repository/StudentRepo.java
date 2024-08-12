package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Student;

public interface StudentRepo extends MongoRepository<Student, Integer> {
	Student findByenrollno(String enrollno);
	//here method name same as entity field name
}
