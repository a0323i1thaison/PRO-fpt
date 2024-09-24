/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thais
 */
public class NhanVien {
    protected String id;
    protected String hoTen;
    protected int tuoi;
    protected String ngaySinh;
    protected int soNgayLamViec;

    public NhanVien(String id, String hoTen, int tuoi, String ngaySinh, int soNgayLamViec) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public double tinhLuong() {
        return 0;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Họ Tên: " + hoTen + ", Tuổi: " + tuoi + ", Ngày Sinh: " + ngaySinh + ", Số Ngày Làm Việc: " + soNgayLamViec;
    }
}
