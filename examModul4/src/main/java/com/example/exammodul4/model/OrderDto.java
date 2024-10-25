package com.example.exammodul4.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDateTime;

public class OrderDto implements Validator {
    private Long ma_don_hang;
    private LocalDateTime ngay_mua;
    private int so_luong;
    private String ten_sp;
    private double gia_sp;
    private double tong_tien;
    private String ten_loai_sp;
    private Long ma_sp;

    public OrderDto() {
    }

    public OrderDto(Long ma_don_hang, LocalDateTime ngay_mua, int so_luong, String ten_sp, double gia_sp, double tong_tien, String ten_loai_sp, Long ma_sp) {
        this.ma_don_hang = ma_don_hang;
        this.ngay_mua = ngay_mua;
        this.so_luong = so_luong;
        this.ten_sp = ten_sp;
        this.gia_sp = gia_sp;
        this.tong_tien = tong_tien;
        this.ten_loai_sp = ten_loai_sp;
        this.ma_sp = ma_sp;
    }

    public OrderDto(Long ma_don_hang, LocalDateTime ngay_mua, int so_luong, String ten_sp, double gia_sp, double tong_tien) {
        this.ma_don_hang = ma_don_hang;
        this.ngay_mua = ngay_mua;
        this.so_luong = so_luong;
        this.ten_sp = ten_sp;
        this.gia_sp = gia_sp;
        this.tong_tien = tong_tien;
    }

    public OrderDto(Long ma_don_hang, LocalDateTime ngay_mua, int so_luong, String ten_sp, double gia_sp, double tong_tien, String ten_loai_sp) {
        this.ma_don_hang = ma_don_hang;
        this.ngay_mua = ngay_mua;
        this.so_luong = so_luong;
        this.ten_sp = ten_sp;
        this.gia_sp = gia_sp;
        this.tong_tien = tong_tien;
        this.ten_loai_sp = ten_loai_sp;
    }

    public OrderDto(String ten_loai_sp, LocalDateTime ngay_mua, int so_luong, String ten_sp, Long ma_don_hang) {
        this.ten_loai_sp = ten_loai_sp;
        this.ngay_mua = ngay_mua;
        this.so_luong = so_luong;
        this.ten_sp = ten_sp;
        this.ma_don_hang = ma_don_hang;

    }

    public String getTen_loai_sp() {
        return ten_loai_sp;
    }

    public Long getMa_sp() {
        return ma_sp;
    }

    public void setMa_sp(Long ma_sp) {
        this.ma_sp = ma_sp;
    }

    // Thay đổi phương thức getter cho ten_loai_sp
    public String getTenLoaiSp() { // Chỉnh sửa ở đây
        return ten_loai_sp;
    }

    public void setTen_loai_sp(String ten_loai_sp) {
        this.ten_loai_sp = ten_loai_sp;
    }

    public Long getMa_don_hang() {
        return ma_don_hang;
    }

    public void setMa_don_hang(Long ma_don_hang) {
        this.ma_don_hang = ma_don_hang;
    }

    public LocalDateTime getNgay_mua() {
        return ngay_mua;
    }

    public void setNgay_mua(LocalDateTime ngay_mua) {
        this.ngay_mua = ngay_mua;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getTen_sp() {
        return ten_sp;
    }

    public void setTen_sp(String ten_sp) {
        this.ten_sp = ten_sp;
    }

    public double getGia_sp() {
        return gia_sp;
    }

    public void setGia_sp(double gia_sp) {
        this.gia_sp = gia_sp;
    }

    public double getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(double tong_tien) {
        this.tong_tien = tong_tien;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
