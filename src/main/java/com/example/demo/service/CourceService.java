package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;

public interface CourceService {
	public String insert(Course course);
	public List<Course>getall();
}
