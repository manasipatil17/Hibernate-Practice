package com.main;

import org.hibernate.cfg.Configuration;

import com.entity.EmpManyToOne;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmpManyToOne.class);
	}
}
