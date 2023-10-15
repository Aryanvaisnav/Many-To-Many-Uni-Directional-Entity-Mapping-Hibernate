package com.jsp.student.course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudentCourseManyToManyUni {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = new Student();
		student.setName("xyz");
		student.setEmail("xyz@gmail.com");
		
		Course course1  = new Course();
		course1.setName("Web-Tech");
		course1.setDuration(1);
		
		Course course2  = new Course();
		course2.setName("SQL");
		course2.setDuration(2);
		
		Course course3  = new Course();
		course3.setName("Java");
		course3.setDuration(2);
		
		Course course4  = new Course();
		course4.setName("Python");
		course4.setDuration(1);
		
		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		
		
		student.setCourses(courses);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(course4);
		entityTransaction.commit();
		
	
	}

}
