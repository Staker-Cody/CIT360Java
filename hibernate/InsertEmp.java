package com.company.hibernate;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertEmp {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Configuration con = new Configuration();
        con.configure("Hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Employee emp = new Employee();
        emp.setId(2);
        emp.setName("Peter");
        emp.setMobile(888);
        emp.setEmail("peter@email");
        s.save(emp);
        s.flush();
        tx.commit();
        s.close();
    }
}