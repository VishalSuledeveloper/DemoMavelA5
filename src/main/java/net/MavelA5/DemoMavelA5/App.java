package net.MavelA5.DemoMavelA5;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Everyone" );
        SessionFactory fact =new Configuration().configure().buildSessionFactory();
        
        System.out.println(fact);
        
        //Create object of the class 
        Student st= new Student();
        
        st.setStudid(1);
        st.setName("Vishal");
        st.setCity("Beed");
        
        Session session=fact.openSession();
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();
        
    }
}
