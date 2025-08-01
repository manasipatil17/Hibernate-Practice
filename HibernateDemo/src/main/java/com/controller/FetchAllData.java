package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.entity.Student;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllData {
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts =ss.beginTransaction();
		
		CriteriaBuilder hb= ss.getCriteriaBuilder();
		CriteriaQuery<Object> cb= hb.createQuery();
		Root<Student> r= cb.from(Student.class);
		cb.select(r);
		Query q = ss.createQuery(cb);
		List<Student> l= q.getResultList();
		for (Student student : l) {
			System.out.println(student);
		}
		ss.close();
		System.out.println("Data is inserted...");
	}
}
