/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3.Model;

/**
 *
 * @author thais
 */
public class NhanVien {
    protected String id;
    protected String ho;
    protected String ten;
    protected int tuoi;
    protected String ngaySinh;
    protected int soNgayLamViec;
    protected int luong;

    public NhanVien() {
    }

    public NhanVien(String id, String ho, String ten, int tuoi, String ngaySinh, int soNgayLamViec, int luong) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
        this.soNgayLamViec = soNgayLamViec;
        this.luong = luong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ho=" + ho + ", ten=" + ten + ", tuoi=" + tuoi + ", ngaySinh=" + ngaySinh + ", soNgayLamViec=" + soNgayLamViec + ", luong=" + luong + '}';
    }
    
}
