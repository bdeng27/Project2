package com.project2.util;

import org.hibernate.Session;

import com.project2.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession();
		s.close();
	}
}