package com.jpa.JPAapp;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Project {
	@Id
	private int projectid;
	@Column
	private String title;
	@Column
	private String details;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List <Employee> employee;
	
	
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", title=" + title + ", details=" + details + "]";
	}
	public Project(int projectid, String title, String details) {
		super();
		this.projectid = projectid;
		this.title = title;
		this.details = details;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
