/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model;

/**
 *
 * @author thais
 */
public abstract class Person {
    private int id ;
    private String name ;
    private String sex ;
    private String email;
    private String dob ;
    private String phoneNumber  ;
    private String CMND;

    public Person() {
    }

    public Person(int id, String name, String sex, String email, String dob, String phoneNumber, String CMND) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.CMND = CMND;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", sex=" + sex + ", email=" + email + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", CMND=" + CMND + '}';
    }
    
    
}
