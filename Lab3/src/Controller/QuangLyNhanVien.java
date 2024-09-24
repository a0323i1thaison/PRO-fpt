/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import Model.NhanVien;
import Model.NhanVienChinhThuc;
import Model.NhanVienThoiVu;

/**
 *
 * @author thais
 */
public class QuangLyNhanVien {

    List<NhanVien> danhSachNhanVien = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themNhanVien() {
        System.out.println("Nhap loai nhan vien  (1: Thoi vu, 2: Chinh thuc): ");
        int loai = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap id : ");
        String id = scanner.nextLine();
        System.out.print("Nhap ho ten : ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ngay sinh (yyyy-MM-dd): ");
        String dob = scanner.nextLine();
        System.out.print("Nhap so ngay lam viec: ");
        int soNgayLamViec = scanner.nextInt();

        if (loai == 1) {
            System.out.print("Nhap muc chiec khau : ");
            double chietKhau = scanner.nextDouble();
            danhSachNhanVien.add(new NhanVienThoiVu(id, hoTen, tuoi, dob, soNgayLamViec, chietKhau));
        } else {
            System.out.print("Nhap so gio OT: ");
            int soGioOT = scanner.nextInt();
            danhSachNhanVien.add(new NhanVienChinhThuc(id, hoTen, tuoi, dob, soNgayLamViec, soGioOT));
        }
    }

    public void hienThiDanhSachNhanVien() {
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }

    public void sapXepNhanVienTheoLuong() {
        Collections.sort(danhSachNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return Double.compare(nv2.tinhLuong(), nv1.tinhLuong());
            }
        });
        System.out.println("Danh sanh nhan vien da duoc sap xep:");
        hienThiDanhSachNhanVien();
    }

    public void timVaXoaNhanVien() {
        System.out.print("Nhap ten nhan vien can xoa: ");
        String hoTen = scanner.nextLine();
        danhSachNhanVien.removeIf(nv -> nv.getHoTen().equalsIgnoreCase(hoTen));
        System.out.println("Nhan vien da duoc xoa.");
    }

    public void hienThiLuongTrungBinh() {
        double tongLuongThoiVu = 0;
        double tongLuongChinhThuc = 0;
        int demThoiVu = 0;
        int demChinhThuc = 0;

        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhanVienThoiVu) {
                tongLuongThoiVu += nv.tinhLuong();
                demThoiVu++;
            } else if (nv instanceof NhanVienChinhThuc) {
                tongLuongChinhThuc += nv.tinhLuong();
                demChinhThuc++;
            }
        }

        if (demThoiVu > 0) {
            System.out.println("Muc luong nhan vien thoi vu: " + (tongLuongThoiVu / demThoiVu));
        }
        if (demChinhThuc > 0) {
            System.out.println("Muc luong nhan vien chinh thuc : " + (tongLuongChinhThuc / demChinhThuc));
        }
    }

    public void menu() {
        while (true) {
            System.out.println("1. Nhap danh sach nhan vien ");
            System.out.println("2. Xuat danh sach nhan vien ");
            System.out.println("3. Sap xep ");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Luong trung binh");
            System.out.println("6. Thoat");
            System.out.print("Chon Mot tuy chon: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    themNhanVien();
                    break;
                case 2:
                    hienThiDanhSachNhanVien();
                    break;
                case 3:
                    sapXepNhanVienTheoLuong();
                    break;
                case 4:
                    timVaXoaNhanVien();
                    break;
                case 5:
                    hienThiLuongTrungBinh();
                    break;
                case 6:
                    System.out.println("Thoat.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu .");
            }
        }
    }
}
