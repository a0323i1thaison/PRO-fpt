/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model.Service;

/**
 *
 * @author thais
 */
public abstract class Service {
    private int idDichVu;
    private String tenDichVu;
    private float giaCa;
    private int soLuongNguoi;
    private String loaiDichVu;

    public Service() {
    }

    public Service(int idDichVu, String tenDichVu, float giaCa, int soLuongNguoi, String loaiDichVu) {
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.giaCa = giaCa;
        this.soLuongNguoi = soLuongNguoi;
        this.loaiDichVu = loaiDichVu;
    }

    public int getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(int idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(float giaCa) {
        this.giaCa = giaCa;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return "Service{" + "idDichVu=" + idDichVu + ", tenDichVu=" + tenDichVu + ", giaCa=" + giaCa + ", soLuongNguoi=" + soLuongNguoi + ", loaiDichVu=" + loaiDichVu + '}';
    }
    public String getInfoToFile (){
        return  this.idDichVu + " , " + this.tenDichVu + " , " + this.giaCa + " , " + this.soLuongNguoi + " , " + this.loaiDichVu;  
    }
   
}
