package com.example.exammodul4.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ma_sp;

    private String ten_sp;
    private double gia_sp;
    private String tinh_trang_sp;

    @ManyToOne
    @JoinColumn(name = "ma_loai_sp")
    private ProductType productType;


    public int getMa_sp() {
        return ma_sp;
    }

    public void setMa_sp(int ma_sp) {
        this.ma_sp = ma_sp;
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
