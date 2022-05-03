package net.MavelA5.DemoMavelA5;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HQLDEMOA5 {
	public static void main(String ags[])
	{
	SessionFactory fact =new Configuration().configure().buildSessionFactory();
	
	Session s=fact.openSession();
	String SelectQuery="from Student where city='Beed'";
	
	Query q1= s.createQuery(SelectQuery);
	
	//Single Records use uniqueresult();
	//Multiple Records -use list();
	List<Student> l=q1.list();
	
	for(Student stud:l)
	{
		System.out.println(stud.getCity());
	}
	
	
	// Update
	Transaction tx=s.beginTransaction();
	
	String UpdateQuery="update Student set city=:X where city=:Y";
	Query q2=s.createQuery(UpdateQuery);
	q2.setParameter("X", "Pune");
	q2.setParameter("Y", "Beed");
	int r= q2.executeUpdate();
	System.out.println(r+" records updated");
	
	tx.commit();
	
	//Delete
	

	
	

}
}
