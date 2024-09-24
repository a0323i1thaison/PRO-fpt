/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.NhanVienChinhThuc;
import Model.NhanVienThoiVu;

/**
 *
 * @author thais
 */
public class Test1 {
    public static void main(String[] args) {
        NhanVienThoiVu nvThoiVu = new NhanVienThoiVu("P001", "Nguyen Van A", 25, "1998-01-01", 10, 0.5);
        NhanVienChinhThuc nvChinhThuc = new NhanVienChinhThuc("F001", "Tran Thi B", 30, "1993-02-02", 20, 10);

        System.out.println(nvThoiVu);
        System.out.println(nvChinhThuc);
    }
    }
    
