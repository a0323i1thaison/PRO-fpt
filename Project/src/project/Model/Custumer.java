/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model;

/**
 *
 * @author thais
 */
public class Custumer extends Person {
    private String diaChi ;
    private String loaiKhachHang;

    public Custumer() {
    }

    public Custumer(String diaChi, String loaiKhachHang) {
        this.diaChi = diaChi;
        this.loaiKhachHang = loaiKhachHang;
    }

    public Custumer(String diaChi, String loaiKhachHang, int id, String name, String sex, String email, String dob, String phoneNumber, String CMND) {
        super(id, name, sex, email, dob, phoneNumber, CMND);
        this.diaChi = diaChi;
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    @Override
    public String toString() {
        return "Custumer{" + "diaChi=" + diaChi + ", loaiKhachHang=" + loaiKhachHang + '}';
    }
    public String getInfoToFile (){
        return this.getName()+ "," + this.getSex() + "," + this.getEmail() + "," + this.getId() + "," + this.getDob()+ "," + this.getPhoneNumber()+ " , " + this.getCMND() + " , " + this.diaChi + " , " + this.loaiKhachHang ;
    }
    
}
