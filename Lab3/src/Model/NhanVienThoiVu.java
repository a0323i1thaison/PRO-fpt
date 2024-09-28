/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author thais
 */
public class NhanVienThoiVu extends NhanVien {
   private int soNgayLamViec;
    private double chietKhau;

    public NhanVienThoiVu(String id, String ho, String ten, int tuoi, Date ngaySinh, int soNgayLamViec, double chietKhau) {
        super(id, ho, ten, tuoi, ngaySinh);
        this.soNgayLamViec = soNgayLamViec;
        this.chietKhau = chietKhau;
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * 1000000 * chietKhau;
    }

    @Override
    public String toString() {
        return super.toString() + ", So Ngay Lam Viec: " + soNgayLamViec + ", Luong: " + tinhLuong();
    }
}
