package com.pratik.user;

import org.hibernate.Session;

import com.pratik.DAO.OneToMany_DAO;
import com.pratik.DAO.OneToMany_DAO_Factory;
import com.pratik.DAO.OneToMany_DAO_IMPL;
import com.pratik.utility.HibernateUtil;

public class TestApp_setdata {

	public static void main(String[] args) {
		Session ses=null;
		OneToMany_DAO dao=null;
		//OneToMany_DAO_IMPL impl=new OneToMany_DAO_IMPL();
		//get the session
		HibernateUtil.getSession();
		//use DAO
		dao=OneToMany_DAO_Factory.getInstance();
		dao.savedata();
		
		//System.out.println(new Insurance_DAO_IMPL().savedata());
		HibernateUtil.closeFactory();

	}

}
