package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class UpdateData {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts =ss.beginTransaction();
	
		Student s=ss.get(Student.class,2);
		s.setAge(22);
		s.setName("Ram");
		
//		ss.update(s);
		ss.merge(s);
	
		ts.commit();
		ss.close();
	
	}

}
