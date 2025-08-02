package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.EmpOneToOne;
import com.entity.LaptopOneToOne;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(LaptopOneToOne.class);
		cfg.addAnnotatedClass(EmpOneToOne.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction ts= ss.beginTransaction();
		
		LaptopOneToOne l1=new LaptopOneToOne();
		l1.setL_id(101);
		l1.setName("Dell");
		ss.persist(l1);
		
		EmpOneToOne e1=new EmpOneToOne();
		e1.setName("Name");
		e1.setCity("Satara");
		e1.setL(l1);
		ss.persist(e1);
		
		EmpOneToOne e2=ss.get(EmpOneToOne.class, 1);
	   System.out.println(e2);
		ts.commit();
		ss.close();
		
	}
}
