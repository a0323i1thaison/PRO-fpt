/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author thais
 */
public abstract class Person {
    private int id ;
    private String fullName ;
    private String phoneNumber ;
    private int year ;
    private String major;

    public Person() {
    }

    public Person(int id, String fullName, String phoneNumber, int year, String major) {
        this.id = 0;
        this.fullName = "";
        this.phoneNumber = "";
        this.year = 0;
        this.major = "";
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", year=" + year + ", major=" + major + '}';
    }
    
     public void InputAll(){
        
    }
}
