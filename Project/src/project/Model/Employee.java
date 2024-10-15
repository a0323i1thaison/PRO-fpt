/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model;

/**
 *
 * @author thais
 */
public class Employee extends Person{
    private String chucVu ;
    private double luong;

    public Employee(String chucVu, double luong) {
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public Employee(String chucVu, double luong, int id, String name, String sex, String email, String dob, String phoneNumber, String CMND) {
        super(id, name, sex, email, dob, phoneNumber, CMND);
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public Employee() {
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + "chucVu=" + chucVu + ", luong=" + luong + '}';
    }
    public String getInfoToFile(){
        return this.getName()+ "," + this.getSex() + "," + this.getEmail() + "," + this.getId() + "," + this.getDob()+ "," + this.getPhoneNumber()+ " , " + this.getCMND() + " , " + this.chucVu + " , " + this.luong ;
    }
    
}
