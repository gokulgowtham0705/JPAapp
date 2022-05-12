package com.jpa.JPAapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Department {
	@Id
	private int deptid;
@Column
private String deptName;
@Column
private String location;
@OneToOne
private Employee employee;

public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Department [deptid=" + deptid + ", deptName=" + deptName + ", location=" + location + "]";
}
public Department(int deptid, String deptName, String location) {
	super();
	this.deptid = deptid;
	this.deptName = deptName;
	this.location = location;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
}
