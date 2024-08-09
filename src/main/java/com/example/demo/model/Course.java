package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cources")
public class Course {
	@Id
	private int cid;
	
	@Indexed(unique=true)
	private String courcecode;
	private String cource;
	private int credits;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourcecode() {
		return courcecode;
	}
	public void setCourcecode(String courcecode) {
		this.courcecode = courcecode;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public Course(int cid, String courcecode, String cource, int credits) {
		super();
		this.cid = cid;
		this.courcecode = courcecode;
		this.cource = cource;
		this.credits = credits;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", courcecode=" + courcecode + ", cource=" + cource + ", credits=" + credits
				+ "]";
	}
	

}
