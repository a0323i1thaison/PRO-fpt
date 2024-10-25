package com.example.exammodul4.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ma_don_hang;

    private LocalDateTime ngay_mua;
    private int so_luong;

    @ManyToOne
    @JoinColumn(name = "ma_sp")
    private Product product;

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
