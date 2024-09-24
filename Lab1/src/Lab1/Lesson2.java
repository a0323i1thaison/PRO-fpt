/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Lesson2 {
    public static void tinhSoTienDien(double a ){
        double soTien ;
        if( a > 50 ){
            soTien = a * 1200;
            System.out.println("so tien dien cua ban la :" + soTien);
        }else if (a < 50){
            soTien = a * 1000;
            System.out.println("so tien dien cua ban la :" + soTien );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao so dien thang nay cua ban : ");
        double soDien = sc.nextDouble();
        tinhSoTienDien(soDien);
        
    }
    
}
