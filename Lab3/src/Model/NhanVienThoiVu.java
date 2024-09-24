/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thais
 */
public class NhanVienThoiVu extends NhanVien {
    private double chietKhau;

    public NhanVienThoiVu(String id, String hoTen, int tuoi, String ngaySinh, int soNgayLamViec, double chietKhau) {
        super(id, hoTen, tuoi, ngaySinh, soNgayLamViec);
        this.chietKhau = chietKhau;
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * 1_000_000 * chietKhau;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lương: " + tinhLuong();
    }
}
