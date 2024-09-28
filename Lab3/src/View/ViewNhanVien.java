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
        System.out.println("1. Nhập danh sách nhân viên");
        System.out.println("2. Xuất danh sách nhân viên");
        System.out.println("3. Sắp xếp giảm dần theo lương");
        System.out.println("4. Tìm và xóa nhân viên theo tên");
        System.out.println("5. Xuất mức lương trung bình của từng loại nhân viên");
        System.out.println("6. Thoát");
        System.out.print("Chọn tùy chọn: ");
        return scanner.nextInt();
    }

    public void hienThiNhanViens(ArrayList<NhanVien> nhanViens) {
        System.out.println("Danh sách nhân viên:");
        for (NhanVien nv : nhanViens) {
            System.out.println(nv);
        }
    }

    public void hienThiLuongTrungBinh(double luongThoiVu, double luongChinhThuc) {
        System.out.println("Mức lương trung bình nhân viên thời vụ: " + luongThoiVu);
        System.out.println("Mức lương trung bình nhân viên chính thức: " + luongChinhThuc);
    }

    public void hienThiThongDiep(String thongDiep) {
        System.out.println(thongDiep);
    }

    public String layTenNhanVien() {
        System.out.print("Nhập tên nhân viên: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public int layLoaiNhanVien() {
        System.out.print("Nhập loại nhân viên (1: Thời vụ, 2: Chính thức): ");
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
