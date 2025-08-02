package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Emp;

public class EmpDao {

	public void insertData(Emp e) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		String hqlQuery = "insert into emp(name, age) values (:name, :age)";
		MutationQuery q= ss.createNativeMutationQuery(hqlQuery);
		q.setParameter("name", "Manasi");
		q.setParameter("age", 21);
		q.executeUpdate();
		
	    System.out.println("Data is inserted...");
		ts.commit();
		ss.close();
	}
	
	public void updateData(Emp e) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Emp.class);
		SessionFactory sf=cfg.buildSessionFactory();
	}
}
