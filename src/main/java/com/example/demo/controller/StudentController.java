package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.service.StudentServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
	StudentServiceImpl scon;

	public StudentController(StudentServiceImpl scon) {
		super();
		this.scon = scon;
	}
	
	@PostMapping("save")
	public String insert(@RequestBody Student sc ){
		return scon.insert(sc);
	}
	
	@PostMapping
	public Student getbyid(@RequestParam int id) {
		return scon.getbyid(id);
	}
	
	@GetMapping
	public List<Student> getall(){
		return scon.getall();
	}
	
	@PostMapping("savecource")
	public String takeacource(String enroll,List<Course> l) {
		return scon.takeacource(enroll, l);
	}
	
	@PostMapping("/fetch")
	public List<Course> getcourcesofstudent(@RequestParam String enroll){
		return scon.getcourcesofstudent(enroll);
	}
	@PostMapping("/f")
	public Student getbyenroll(@RequestParam String enroll) {
		return scon.getbyenroll(enroll);
	}
	@PostMapping("/fe")
	public String getname(@RequestParam String enroll) {
		return scon.getname(enroll);
	}
	
	

}
