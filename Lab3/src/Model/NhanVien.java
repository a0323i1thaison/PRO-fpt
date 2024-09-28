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
public abstract class NhanVien {
    protected String id;
    protected String ho;
    protected String ten;
    protected int tuoi;
    protected Date ngaySinh;

    public NhanVien(String id, String ho, String ten, int tuoi, Date ngaySinh) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "ID: " + id + ", Ho: " + ho + ", Ten: " + ten + ", Tuoi: " + tuoi + ", Ngay Sinh: " + ngaySinh;
    }
}

