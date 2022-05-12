package com.jpa.JPAapp;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.awt.List;
import java.util.ArrayList;

import javax.persistence.*;

public class App {
	public static void main(String[] args) {

		// EntityManagerFactory
		// emf=Persistence.createEntityManagerFactory("employeePU");
		// EntityManager em=emf.createEntityManager();
		//
		// Employee employee=new Employee(10,"Bhai","Mumbai",200);

		// em.getTransaction().begin();
		// em.persist(employee);
		// em.getTransaction().commit();
		//

		// Employee emp=em.find(Employee.class,1);
		// System.out.println(emp);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePU");
		EntityManager em = emf.createEntityManager();
		
Project project = new Project(1,"Project","title");
    	
    	Employee e1 = new Employee(101);
    	Employee e2 = new Employee(102);
    	Employee e3 = new Employee(103);

    	ArrayList <Employee> list = new ArrayList();
    	list.add(e1);
    	list.add(e2);
    	list.add(e3);
    	project.setEmployee(list);
      	
    	   Department dept = new Department();
    	     dept.setDeptid(101);
    	     dept.setDeptName("hr");
    	    dept.setLocation("delhi");
    	     
    	    Employee employee = new Employee(112, "jonny", "delhi", 20000);
    	   employee.setDepartment(dept);
    	   employee.setProject(project);
    	     
    	     em.getTransaction().begin();
    	        em. persist(employee);
    	        em.persist(dept);
    	        em.persist(project);
       	     em.getTransaction().commit();
		


		
//		Project proj= new Project();
//		proj.setProjectid(101);
//		proj.setTitle("JPAApp");
//		proj.setDetails("Many to one progrram");
//		
//		Employee e1=new Employee(301);
//		Employee e2=new Employee(302);
//		Employee e3=new Employee(303);
//		ArrayList <Employee> list=new ArrayList();
//		list.add(e3);
//		list.add(e2);
//		list.add(e1);
//
//		proj.setEmployee(list);
//		
//		Department depart=new Department();
//		depart.setDeptid(201);
//		depart.setDeptName("Mechotriics");
//		depart.setLocation("Manamadurai");
//		
//		Employee employee = new Employee(28, "Balaji", "Guruk", 400);
//		
//		employee.setDepartment(depart);
//		depart.setEmployee(employee);
//		employee.setProject(proj);
//
//		em.getTransaction().begin();
//		em.persist(employee);
//		em.persist(depart);
//		em.persist(proj);
//		em.getTransaction().commit();

		// Query maxSalary = em.createQuery("select max(e.salary) from Employee e");
		// int emp=(Integer) maxSalary.getSingleResult();
		// System.out.println(emp);
		
		
	}
}

/**
 * Hello world!
 *
 */
