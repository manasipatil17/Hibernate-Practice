package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.DeptManyToOne;
import com.entity.EmpManyToOne;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmpManyToOne.class);
		cfg.addAnnotatedClass(DeptManyToOne.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction ts=ss.beginTransaction();
		
		DeptManyToOne d=new DeptManyToOne();
		d.setD_Id(101);
		d.setDept_name("Java Developer");
		
		ss.persist(d);
		
		EmpManyToOne e= new EmpManyToOne();
		e.setName("Manasi");
	    e.setD(d);
	    ss.persist(e);
		EmpManyToOne e1= new EmpManyToOne();
		e1.setName("Ram");
		e1.setD(d);
	 
		
		ss.persist(e1);
	
		ts.commit();
		ss.close();
		
	}
}
