package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourceRepo;
@Service
public class CourceServiceImpl implements CourceService {
	
	CourceRepo crepo;

	public CourceServiceImpl(CourceRepo crepo) {
		super();
		this.crepo = crepo;
	}

	@Override
	public String insert(Course course) {
		crepo.save(course);
		return"success";
	}

	@Override
	public List<Course> getall() {
		return crepo.findAll();
	}

}
