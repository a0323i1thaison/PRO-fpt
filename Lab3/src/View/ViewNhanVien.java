/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.NhanVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thais
 */
 public class ViewNhanVien {
    private Scanner scanner;

    public ViewNhanVien() {
        scanner = new Scanner(System.in);
    }

    public int hienThiMenu() {
        System.out.println("Menu:");
        System.out.println("1. Nhap danh sanh nhan vien ");
        System.out.println("2. Xuat danh sach nhan vien ");
        System.out.println("3. Sap xep giam dan theo luong ");
        System.out.println("4. Tim va xoa nhan vien theo ten ");
        System.out.println("5. Xuat muc luong trung binh cua tung loai nhan vien ");
        System.out.println("6. Thoat");
        System.out.print("Chon tuy chon : ");
        return scanner.nextInt();
    }

    public void hienThiNhanViens(ArrayList<NhanVien> nhanViens) {
        System.out.println("Danh sach nhan vien :");
        for (NhanVien nv : nhanViens) {
            System.out.println(nv);
        }
    }

    public void hienThiLuongTrungBinh(double luongThoiVu, double luongChinhThuc) {
        System.out.println("Muc luong trung binh nhan vien thoi vu: " + luongThoiVu);
        System.out.println("Muc luong trung binh nhan vien chinh thuc : " + luongChinhThuc);
    }

    public void hienThiThongDiep(String thongDiep) {
        System.out.println(thongDiep);
    }

    public String layTenNhanVien() {
        System.out.print("Nhap ten nhan vien : ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public int layLoaiNhanVien() {
        System.out.print("Nhap loại nhan vien  (1: Thoi vu , 2: Chinh thuc ): ");
        return scanner.nextInt();
    }

    public String layDuLieu(String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public int layDuLieuInteger(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public double layDuLieuDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    
    
    
}
