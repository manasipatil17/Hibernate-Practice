package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.DeptOneToMany;
import com.entity.EmpOneToMany;


public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(DeptOneToMany.class);
		cfg.addAnnotatedClass(EmpOneToMany.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction ts= ss.beginTransaction();
		
		EmpOneToMany e=new EmpOneToMany();
		e.setEmp_name("Manasi");
		ss.persist(e);
		
		EmpOneToMany e1= new EmpOneToMany();
		e1.setEmp_name("Ram");
		ss.persist(e1);
		
		DeptOneToMany d=new DeptOneToMany();
		d.setD_id(101);
		d.setDept_name("Software Developer");
        ArrayList list=new ArrayList();
        
        list.add(e);
        list.add(e);
        
        d.setE(list);
        ss.persist(d);
		
		ts.commit();
		ss.close();
		
		
	}
}
