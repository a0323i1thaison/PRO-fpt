package com.example.exammodul4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma_loai_sp;

    private String ten_loai_sp;

    public ProductType() {
    }

    public ProductType(Long ma_loai_sp, String ten_loai_sp) {
        this.ma_loai_sp = ma_loai_sp;
        this.ten_loai_sp = ten_loai_sp;
    }

    public Long getMa_loai_sp() {
        return ma_loai_sp;
    }

    public void setMa_loai_sp(Long ma_loai_sp) {
        this.ma_loai_sp = ma_loai_sp;
    }

    public String getTen_loai_sp() {
        return ten_loai_sp;
    }

    public void setTen_loai_sp(String ten_loai_sp) {
        this.ten_loai_sp = ten_loai_sp;
    }
}
