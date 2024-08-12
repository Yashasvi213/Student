package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Branch;


public interface BranchService {
	public String insert(Branch b);
	public List<Branch> getall();
	public Branch getbyid(int id);
}
