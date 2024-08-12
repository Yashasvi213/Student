package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Branch;
import com.example.demo.repository.BranchRepo;

@Service
public class BranchServiceImpl implements BranchService {
	BranchRepo brepo;
	public BranchServiceImpl(BranchRepo brepo) {
		super();
		this.brepo = brepo;
	}

	@Override
	public String insert(Branch b) {
		brepo.save(b);
		return "success";
	}

	@Override
	public List<Branch> getall() {
		List<Branch>l1=brepo.findAll();
		return l1;
	}

	@Override
	public Branch getbyid(int id) {
		Branch b=brepo.findById(id).get();
		return null;
	}
	

}
