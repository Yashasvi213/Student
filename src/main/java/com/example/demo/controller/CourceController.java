package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourceServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/courses")
public class CourceController {
	CourceServiceImpl ccon;

	public CourceController(CourceServiceImpl ccon) {
		super();
		this.ccon = ccon;
	}
	@PostMapping("save")
	public String insert(@RequestBody Course c) {
		ccon.insert(c);
		return "success";
	}
	
	@GetMapping
	public List<Course>getall(){
		return ccon.getall();
	}
}
