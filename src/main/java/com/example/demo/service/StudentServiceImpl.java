package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	StudentRepo srepo;



	public StudentServiceImpl(StudentRepo srepo) {
		super();
		this.srepo = srepo;
	}

	@Override
	public String insert(Student ss) {
		srepo.save(ss);
		return "success";
	}

	@Override
	public List<Student> getall() {
		List<Student> l1=srepo.findAll();
		return l1;
	}

	@Override
	public Student getbyid(int id) {
		Student s1=srepo.findById(id).get();
		return s1;
	}
	//step 1; Retrieve the student by enrollment number
	//step 2 // Add the courses to the student's list
	//step 3 Save the updated student back to the database
	//step 4 // Return a success message

	@Override
	public String takeacource(String enroll, List<Course> cser) {
		Student student=srepo.findByenrollno(enroll);
		
		if(student==null) {
			return "fail";
		}
		List<Course> existingcource= student.getCourses();
		for(Course c:existingcource) {
			if(!existingcource.contains(c)) {
				existingcource.add(c);
			}
			
		}
		
		student.setCourses(existingcource);
		srepo.save(student);
		
		return "success";
	}
	
	@Override
	public List<Course> getcourcesofstudent(String enroll) {
	    Student student = srepo.findByenrollno(enroll);
	    return student.getCourses();
	}
	@Override
	public Student getbyenroll(String enroll) {
		Student student = srepo.findByenrollno(enroll);
		System.out.println(student.getName());
		return student;
	}

	@Override
	public String getname(String enroll) {
		Student student = srepo.findByenrollno(enroll);
		return student.getName();
	}


}
