package com.example.demo.model;


public class Employee {
	
	private int id;
	private String name;
	private String addr;
	private String mobno;
	private String uname;
	private String pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + ", mobno=" + mobno + ", uname=" + uname
				+ ", pass=" + pass + "]";
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
