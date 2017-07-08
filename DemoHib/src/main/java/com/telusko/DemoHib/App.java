package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Alien telusko= new Alien();
        telusko.setAid(104);
        telusko.setAname("sarnggg");
        telusko.setColor("black");
        
        Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf =con.buildSessionFactory(reg);
        Session session =sf.openSession();
        Transaction tx =session.beginTransaction();
        session.save(telusko);
        tx.commit();
    }
}
