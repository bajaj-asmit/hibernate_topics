package com.creiteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.annotations.Persister;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.Student;

public class DemoExample {

	public static void main(String[] args) {
	
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria c=session.createCriteria(Student.class);
		
//		c.add(Restrictions.gt("id", 500));
		c.add(Restrictions.eq("Sname", "ashmit"));
		List<Student> list=c.list();
		
		for(Student s:list)
		{
			System.out.println(s);
		}
		
		session.close();
	}

}
