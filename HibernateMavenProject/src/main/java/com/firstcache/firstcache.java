package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class firstcache {

	public static void main(String[] args) {
	
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		// by default enabled 
		
		Student student= session.get(Student.class,562 );
       System.out.println(student);
       
       System.out.println("working something ");
       
       /// in this case it will not fire query again it will fetch the data form session class
       Student student2=session.get(Student.class, 562);
       
       System.out.println(student2);
       
       System.out.println(session.contains(student2));
	}

}
