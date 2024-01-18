package com.example.demo.model;


import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Department {
	@Id
	private int did;
	private String dname;
	@OneToMany(cascade= CascadeType.ALL,mappedBy = "dept")
	private List<Student> student=new ArrayList<>();
	
	public int getDid(){
		return did;
	}

	public void setDid(int did){
		this.did = did;
	}
	
	public List<Student> getStudent() {
		return student;
	}
	@JsonManagedReference
	public void setStudent(List<Student> student){
		this.student = student;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", "
				+
				"student=" + student +
				"]";
	}
	

}
