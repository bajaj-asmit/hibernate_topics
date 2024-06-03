package com.HQLPagination;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class Pagination {

	public static void main(String[] args) {
	
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Query query=session.createQuery("from Student");
		
		// implimentation pagination in hibernate
		
		query.setFirstResult(10);
		query.setMaxResults(3);
		List<Student> list=query.list();
		
		for(Student s:list)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCity());
		}
 	}

}
