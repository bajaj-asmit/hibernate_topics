package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class DemoCascade {

	public static void main(String[] args) {
	
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Question q1=new Question();
		q1.setQuestionid(111);
		q1.setQuestion("what is sql");
		
		Answer a1=new Answer(19,"structured query langauge");
		Answer a2=new Answer(199,"use in database");
		Answer a3=new Answer(191,"perform database operation");
		a1.setQuestion(q1);
		a2.setQuestion(q1);
		a3.setQuestion(q1);
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);
		
		// with the help of cascade we didn't need to store answer its autmatically store after saveing question
		// we set cascade in question class in onetomanyfield
		
		Transaction tx=session.beginTransaction();
		
		session.save(q1);
		
		
		tx.commit();
		
		sessionFactory.close();
	}

}
