package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMap {

	public static void main(String[] args) {
		   Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory sessionFactory=cfg.buildSessionFactory();
//      
//	       Question q1=new Question();
//	       
//	       q1.setQuestionid(1212);
//	       q1.setQuestion("What is java?");
//	       
//	       Answer a1=new Answer();
//	       
//	       a1.setAnswerid(343);
//	       a1.setAnswer("Java is programming language.");
//	       a1.setQuestion(q1);
//	       
//           Answer a2=new Answer();
//	       
//	       a2.setAnswerid(33);
//	       a2.setAnswer("with the help of java we can create softwares.");
//	       a2.setQuestion(q1);
//           Answer a3=new Answer();
//	       
//	       a3.setAnswerid(323);
//	       a3.setAnswer("java has many frameworks.");
//	       a3.setQuestion(q1);
//	       List<Answer> list=new ArrayList<Answer>();
//	       
//	       list.add(a1);
//	       list.add(a2);
//	       list.add(a3);
	       
//	       q1.setAnswers(list);
//	       q1.setAnswer(a1);
//          Question q2=new Question();
//	       
//	       q2.setQuestionid(242);
//	       q2.setQuestion("What is collection framework?");
//	       
//	       Answer a2=new Answer();
//	       
//	       a2.setAnswerid(344);
//	       a2.setAnswer("API to work with group of objects.");
//	       q2.setAnswer(a2);
//	       
//           Question q3=new Question();
//	       
//	       q3.setQuestionid(234324);
//	       q3.setQuestion("How to work with netBeans?");
//	       
//	       Answer a3=new Answer();
//	       
//	       a3.setAnswerid(777);
//	       a3.setAnswer("IDE for writing codes.");
//	       q3.setAnswer(a3);
//	       
//          Answer a4=new Answer();
//	       
//	       a4.setAnswerid(7776);
//	       a4.setAnswer("Python programming language too.");
	       
	       Session session = sessionFactory.openSession();
	       
	       Transaction tx=session.beginTransaction();
	       
	       ////one to many && many to one
//	       session.save(q1);
//	       
//	       session.save(a1);
//	       session.save(a2);
//	       session.save(a3);
	       
	       ////one to one
//	       session.save(q1);
//	       session.save(q2);
//	       session.save(q3);
//	       
//	       session.save(a1);
//	       session.save(a2);
//	       session.save(a3);
//	       session.save(a4);
	       
	       tx.commit();
	       
	       ////one to many
	       
	       Question res =(Question)session.get(Question.class, 1212);
	       
	       // by default running lazy
	       System.out.println(res.getQuestionid());
	       System.out.println(res.getQuestion());
	       System.out.println(res.getAnswers().size());
	       
//	       
//	       for(Answer a:res.getAnswers())
//	       {
//	    	   System.out.println(a.getAnswer());
//	       }
//	       
	       ////one to one
//	       Question res=(Question)session.get(Question.class, 242); 
//	       System.out.println(res.getQuestion());
//	       System.out.println(res.getAnswer().getAnswer());
	       
	       sessionFactory.close();
	}

}
