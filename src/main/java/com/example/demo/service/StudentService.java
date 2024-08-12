package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
//this is for branch
public interface StudentService {
	public String insert(Student ss);
	public List<Student>getall();
	public Student getbyid(int id);
	public String takeacource(String enroll, List<Course> cser);
	public List<Course> getcourcesofstudent(String enroll);
	public Student getbyenroll(String enroll);
	public String getname(String enroll);
	
	
	

}
