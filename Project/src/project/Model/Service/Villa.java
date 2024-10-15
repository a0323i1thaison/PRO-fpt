/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model.Service;

/**
 *
 * @author thais
 */
public class Villa extends Service{
    private float dienTichHoBoi;
    private int soLuongPhong;

    public Villa() {
    }

    public Villa(float dienTichHoBoi, int soLuongPhong) {
        this.dienTichHoBoi = dienTichHoBoi;
        this.soLuongPhong = soLuongPhong;
    }

    public Villa(float dienTichHoBoi, int soLuongPhong, int idDichVu, String tenDichVu, float giaCa, int soLuongNguoi, String loaiDichVu) {
        super(idDichVu, tenDichVu, giaCa, soLuongNguoi, loaiDichVu);
        this.dienTichHoBoi = dienTichHoBoi;
        this.soLuongPhong = soLuongPhong;
    }

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoLuongPhong() {
        return soLuongPhong;
    }

    public void setSoLuongPhong(int soLuongPhong) {
        this.soLuongPhong = soLuongPhong;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.dienTichHoBoi + " , " +  this.soLuongPhong ;
    }
    public String getInfoToFile(){
       return super.getInfoToFile() + "," + this.dienTichHoBoi + " , " + this.soLuongPhong;
    }       
}
