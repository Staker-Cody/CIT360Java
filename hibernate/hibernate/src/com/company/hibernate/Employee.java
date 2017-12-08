package com.company.hibernate.hibernate.src.com.company.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee{
    @Id
    @Column(name="id")
    private int id;

    @Column(name="ename")
    private String ename;


    @Column(name ="mobile")
    private int mobile;

    public Employee(int id, String ename, int mobile) {
        this.id = id;
        this.ename = ename;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
