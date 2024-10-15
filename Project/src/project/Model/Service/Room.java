/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model.Service;

/**
 *
 * @author thais
 */
public class Room extends Service{
    private String dichVuMienPhi ;

    public Room() {
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String dichVuMienPhi, int idDichVu, String tenDichVu, float giaCa, int soLuongNguoi, String loaiDichVu) {
        super(idDichVu, tenDichVu, giaCa, soLuongNguoi, loaiDichVu);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.dichVuMienPhi + '}';
    }
    
    public String getInfoToFile() {
        return super.getInfoToFile() + "," + this.dichVuMienPhi;
    }
    
}
