package com.jpa.JPAapp;

import java.util.List;

import javax.persistence.*;

//@Entity(name = "EmployeeTable")
@Entity
public class Employee {
	@Id
	private int id;
	@Column
	private String name;

	public int getSalary() {
		return salary;
	}
	@OneToOne
	@JoinColumn(name="salary")
	private Department department;
	@ManyToOne
	private  Project project;

	

	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(int id, String name, String location, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}

	@Column
	private String location;
	@Column
	private int salary;

	public int getId() {
		return id;
	}

	public Employee(String name, String location) {
		super();
		this.name = name;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

}