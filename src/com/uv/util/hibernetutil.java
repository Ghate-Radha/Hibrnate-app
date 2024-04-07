package com.uv.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uv.model.hdfchibernet;



public class hibernetutil 
{
  public static SessionFactory sessionfactory=null;
  public static Session session=null;
   private hibernetutil()
   {
	   
   }
	
   static {
    sessionfactory = new Configuration().configure().addAnnotatedClass(hdfchibernet.class).buildSessionFactory();}



public static Session  getsession()
{
	if(session==null) 
	
	return session=sessionfactory.openSession();
	return session;
}

public void closesession() 
{
	if(session!=null)
	  session.close();
}

public void closesessionfactory() {
	if(sessionfactory!=null)
		sessionfactory.close();
}

}