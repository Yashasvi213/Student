package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Branch;

import com.example.demo.service.BranchServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/branch")
public class BranchController {
	BranchServiceImpl bser;

	public BranchController(BranchServiceImpl bser) {
		super();
		this.bser = bser;
	}
	
	@PostMapping("save")
	public String insert(@RequestBody Branch b1) {
		return bser.insert(b1);
	}
	

}
