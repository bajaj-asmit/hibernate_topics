package com.states;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tut.Certificate;
import com.tut.Student;

public class DemoStates {

	public static void main(String[] args) {
	
	SessionFactory sessionFactory=(SessionFactory) new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Student student1=new Student();
	student1.setId(1010);
	student1.setName("akshit");
	student1.setCerti(new Certificate("abc","two month"));
	//transient state 
    
	Session session= sessionFactory.openSession();
	
	Transaction tx= session.beginTransaction();
	session.save(student1);
	//persistent state
	student1.setCity("kuk");
	tx.commit();
	sessionFactory.close();
	}

}
