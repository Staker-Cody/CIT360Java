package com.company.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class insertEmployee {

    public static void main(String[]args){
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            System.out.println("Creating New Employee");
            Employee newEmp = new Employee(1,"Cody Staker",2082701863);

            session.beginTransaction();
            session.save(newEmp);
            session.getTransaction().commit();
        }finally{
            factory.close();
        }

    }
}
