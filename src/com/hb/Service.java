package com.hb;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("Service")
public class Service{
	
	private SessionFactory sessionFactory;
	

	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}




	public void show() {
		
		Person person=new Person();
		person.setPersonName("aaa");
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		System.out.println("dddd");
		//dao.show();
	}
	
	
}
