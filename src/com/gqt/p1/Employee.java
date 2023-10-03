package com.gqt.p1;

public class Employee {
	int empid;
	
	String empname;
	int empsalary;
	String empcompany;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpcompany() {
		return empcompany;
	}
	public void setEmpcompany(String empcompany) {
		this.empcompany = empcompany;
	}
	
	public Employee(int empid, String empname, int empsalary, String empcompany) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empcompany = empcompany;
	}
	public Employee() {
		
	}
	
}
