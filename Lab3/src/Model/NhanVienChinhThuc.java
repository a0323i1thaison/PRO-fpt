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
public class NhanVienChinhThuc extends NhanVien {
    private int soNgayLamViec;
    private int soGioOT;

    public NhanVienChinhThuc(String id, String ho, String ten, int tuoi, Date ngaySinh, int soNgayLamViec, int soGioOT) {
        super(id, ho, ten, tuoi, ngaySinh);
        this.soNgayLamViec = soNgayLamViec;
        this.soGioOT = soGioOT;
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * 1000000 + soGioOT * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + ", So Ngay Lam Viec: " + soNgayLamViec + ", So Gio  OT: " + soGioOT + ", Luong: " + tinhLuong();
    }
}
