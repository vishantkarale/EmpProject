package com.example.demo.daoImpl;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Student;
import com.example.demo.dao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void createStudent(Set<Student> list) {
		System.out.println("in dao");
		for (Student s : list) {
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(s);
			session.getTransaction().commit();

			System.out.println("Added Successfully");
		}
	}

}
