/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3.Model;

/**
 *
 * @author thais
 */
public class NhanVienChinhThuc extends NhanVien{
    protected int soGioOT;

    public NhanVienChinhThuc() {
    }

    public NhanVienChinhThuc(int soGioOT) {
        this.soGioOT = soGioOT;
    }

    public NhanVienChinhThuc(int soGioOT, String id, String ho, String ten, int tuoi, String ngaySinh, int soNgayLamViec, int luong) {
        super(id, ho, ten, tuoi, ngaySinh, soNgayLamViec, luong);
        this.soGioOT = soGioOT;
    }

    public int getSoGioOT() {
        return soGioOT;
    }

    public void setSoGioOT(int soGioOT) {
        this.soGioOT = soGioOT;
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
        return "Nhan Vien Chinh Thuc :"+ super.getId() +";" +super.getHo()+  ";" + super.getTen()+ ";" +
                super.getTuoi()+";"+  super.getNgaySinh()+ ";" +  super.getSoNgayLamViec()+ ";" + super.getLuong()+ ";" + soGioOT ;
    }
    
    
    
}
