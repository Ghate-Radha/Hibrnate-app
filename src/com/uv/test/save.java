package com.uv.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.uv.model.hdfchibernet;
import com.uv.util.hibernetutil;
import com.uv.model.hdfchibernet;

public class save 
{
	
	public static void main(String[] args)
	{
		hdfchibernet hdfc=new hdfchibernet();
		hdfc.setHid(1);
		hdfc.setHname("radha");
		hdfc.setHid(10);
		hdfc.setHname("aarya");
		
		
		Session session=hibernetutil.getsession();
		Transaction transaction=session.beginTransaction();
		
		session.save(hdfc);
		transaction.commit();
		
	
	}
	
	  
	  
	  
}
	
	

