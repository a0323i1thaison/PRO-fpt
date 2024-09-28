/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author thais
 */
public class CongTy {
     private String ten;
    private ArrayList<NhanVien> nhanViens;

    public CongTy(String ten) {
        this.ten = ten;
        this.nhanViens = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nhanVien) {
        nhanViens.add(nhanVien);
    }

    public ArrayList<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public String getTen() {
        return ten;
    }

    public void sapXepNhanVienTheoLuong() {
        nhanViens.sort((nv1, nv2) -> Double.compare(nv2.tinhLuong(), nv1.tinhLuong()));
    }

    public void timVaXoaNhanVienTheoTen(String ten) {
        nhanViens.removeIf(nv -> (nv.ho + " " + nv.ten).equalsIgnoreCase(ten));
    }

    public double luongTrungBinhTheoLoai(Class<? extends NhanVien> loaiNhanVien) {
        double tongLuong = 0;
        int count = 0;
        for (NhanVien nv : nhanViens) {
            if (loaiNhanVien.isInstance(nv)) {
                tongLuong += nv.tinhLuong();
                count++;
            }
        }
        return count > 0 ? tongLuong / count : 0;
    }
    
}
