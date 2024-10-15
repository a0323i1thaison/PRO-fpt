/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.model;

import java.time.LocalDate;

/**
 *
 * @author thais
 */
public class xeDap {
    private String maXeDap;
    private int tocDo;
    private double khoangCach;
    private boolean xeDapDien;
    private LocalDate ngaySanXuat;

    public xeDap() {
    }

    public xeDap(String maXeDap, int tocDo, double khoangCach, boolean xeDapDien, LocalDate ngaySanXuat) {
        this.maXeDap = maXeDap;
        this.tocDo = tocDo;
        this.khoangCach = khoangCach;
        this.xeDapDien = xeDapDien;
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getMaXeDap() {
        return maXeDap;
    }

    public void setMaXeDap(String maXeDap) {
        this.maXeDap = maXeDap;
    }

    public int getTocDo() {
        return tocDo;
    }

    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }

    public double getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(double khoangCach) {
        this.khoangCach = khoangCach;
    }

    public boolean isXeDapDien() {
        return xeDapDien;
    }

    public void setXeDapDien(boolean xeDapDien) {
        this.xeDapDien = xeDapDien;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    
}
