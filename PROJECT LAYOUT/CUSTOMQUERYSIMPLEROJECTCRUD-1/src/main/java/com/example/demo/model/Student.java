package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
//@Data
public class Student {
@Id
private int sid;
private String sname;
private String slname;
private String mobno;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSlname() {
	return slname;
}
public void setSlname(String slname) {
	this.slname = slname;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}

}
