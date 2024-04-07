package com.uv.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.uv.model.hdfchibernet;
import com.uv.util.hibernetutil;

public class fetch 
{

	public static void main(String[] args) {
		hdfchibernet hibernet=new hdfchibernet();
		Session session=hibernetutil.getsession();
		Transaction transaction=session.beginTransaction();
		System.out.println(session.get(hdfchibernet.class, 2));;
		transaction.commit();
		
	}
}
