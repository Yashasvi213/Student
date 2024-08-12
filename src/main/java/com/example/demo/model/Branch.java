package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="branches")
public class Branch {
	@Id
	private int bid;
	
	@Indexed(unique=true)
	private String branchcode;
	private String branches;
	
	@DBRef
	private List<Course> cources;
	//this is many to many mapping

	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", branchcode=" + branchcode + ", branches=" + branches + ", cources=" + cources
				+ "]";
	}

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(int bid, String branchcode, String branches, List<Course> cources) {
		super();
		this.bid = bid;
		this.branchcode = branchcode;
		this.branches = branches;
		this.cources = cources;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

	public String getBranches() {
		return branches;
	}

	public void setBranches(String branches) {
		this.branches = branches;
	}

	public List<Course> getCources() {
		return cources;
	}

	public void setCources(List<Course> cources) {
		this.cources = cources;
	}
	
}
