package com.leapfrog.cps.util;

public class Student {
    private int id;
    private String fName,lName,email,contact;
    private boolean status;

    public Student() {
    }

    public Student(int id, String fName, String lName, String email, String contact, boolean status) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.contact = contact;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
