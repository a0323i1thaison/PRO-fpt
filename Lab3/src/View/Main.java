/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.ControllerNhanVien;
import Model.CongTy;

/**
 *
 * @author thais
 */
public class Main {
    public static void main(String[] args) {
        CongTy congTy = new CongTy("Company FPT");
        ViewNhanVien view = new ViewNhanVien();
        ControllerNhanVien controller = new ControllerNhanVien(congTy, view);
        
        controller.chay();
    }
}
