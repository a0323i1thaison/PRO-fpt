/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.student;

/**
 *
 * @author thais
 */
public class Student {
    private int id ;
    private String ten;
    private String nganh;
    private double gpa;

    public Student(int id, String ten, String nganh, double gpa) {
        this.id = id;
        this.ten = ten;
        this.nganh = nganh;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student " + "  id :  " + id + " Ten : " + ten + " Nganh :" + nganh + "GPA :" + gpa ;
    }  
}
