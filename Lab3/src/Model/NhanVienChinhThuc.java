/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thais
 */
public class NhanVienChinhThuc extends NhanVien {
    private int soGioOT;

    public NhanVienChinhThuc(String id, String hoTen, int tuoi, String ngaySinh, int soNgayLamViec, int soGioOT) {
        super(id, hoTen, tuoi, ngaySinh, soNgayLamViec);
        this.soGioOT = soGioOT;
    }

    @Override
    public double tinhLuong() {
        return soNgayLamViec * 1_000_000 + soGioOT * 100_000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lương: " + tinhLuong();
    }
}
