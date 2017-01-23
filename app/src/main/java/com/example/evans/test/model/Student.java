package com.example.evans.test.model;

import com.orm.SugarRecord;

/**
 * Created by evans on 11/26/2016.
 */

public class Student extends SugarRecord {
   private String firstname;
    private String lastname;
    private String regnumber;
    private String emailaddress;

    public Student() {
    }

    public Student(String firstname, String lastname, String regnumber, String emailaddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.regnumber = regnumber;
        this.emailaddress = emailaddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", regnumber='" + regnumber + '\'' +
                ", emailaddress='" + emailaddress + '\'' +
                '}';
    }
}
