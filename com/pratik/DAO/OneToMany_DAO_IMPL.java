package com.pratik.DAO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.pratik.domain.Mobiles_OTM;
import com.pratik.domain.Person_OTM;
import com.pratik.utility.HibernateUtil;

public class OneToMany_DAO_IMPL implements OneToMany_DAO {

	@Override
	public String savedata()  {
		Session ses=null;
		Transaction tx=null;
		String newresult=null;
		Set<Mobiles_OTM> mobs=null;;
			//get the session
		ses=HibernateUtil.getSession();
		//create the objects and set the data
			Person_OTM p=new Person_OTM();
			Mobiles_OTM m1 =new Mobiles_OTM();
			Mobiles_OTM m2 =new Mobiles_OTM();
			
			p.setName("Pratik");
			p.setCity("Pune");
			//set values to childs
				m1.setPhonenumber(11111111L);
				m1.setOperator("Idea");
				m2.setPhonenumber(77777777L);
				m2.setOperator("Vodafone");
				//add childs to set
				mobs=new HashSet<Mobiles_OTM>();
				mobs.add(m1);
				mobs.add(m2);
			p.setPhones(mobs);
			
			//save the objects
			try {
				tx=ses.beginTransaction();
				ses.save(p);
				ses.save(m1);
				ses.save(m2);
				tx.commit();
				//newresult="Object is Saved";
				System.out.println("\t--> Object is Saved <--");
				
			}catch (HibernateException he) {
				he.printStackTrace();
				tx.rollback();
				System.out.println("\t--> Object is not Saved <--");
				//newresult="Object is not Saved";
			}
			catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
				System.out.println("\t--> Object is not Saved <--");
				//newresult="Object is not Saved";
			}
			finally {
				try {
					HibernateUtil.closeSession(ses);
					
				}catch (HibernateException he) {
					he.printStackTrace();
				}
				catch (Exception e) {
					e.printStackTrace();;
				}
				
			}
			
		return newresult;
}//class ends
