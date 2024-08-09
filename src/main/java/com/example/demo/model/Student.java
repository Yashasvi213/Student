package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	@Id
	private int sid;
	private String name;
	
	@Indexed(unique=true)
	private String enrollno;
	private String email;
	private int phone;
	
	@DBRef
	private Branch branch;  //this is one to many mapping
	//This indicates that instead of embedding the entire Branch document within Student,
	//MongoDB will store a reference (the _id of the Branch document).
	
	@DBRef
	private List<Course> courses;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", enrollno=" + enrollno + ", email=" + email + ", phone="
				+ phone + ", branch=" + branch + ", courses=" + courses + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String enrollno, String email, int phone, Branch branch,
			List<Course> courses) {
		super();
		this.sid = sid;
		this.name = name;
		this.enrollno = enrollno;
		this.email = email;
		this.phone = phone;
		this.branch = branch;
		this.courses = courses;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnrollno() {
		return enrollno;
	}
	public void setEnrollno(String enrollno) {
		this.enrollno = enrollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	

}
