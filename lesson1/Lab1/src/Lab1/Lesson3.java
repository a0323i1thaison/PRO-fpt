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
public class Lesson3 {
    public static void displayMenu(int chose){
        Scanner sc = new Scanner(System.in);
            switch (chose) {
                case 1:
                     System.out.println(" Nhap vao so a :");
                     int a = sc.nextInt();
                     System.out.println(" Nhap vao so b :");
                     int b = sc.nextInt();
                     System.out.println(" Nhap vao so c :");
                     int c = sc.nextInt();
                    Lesson1.pT2(a, b, c);
                    break;
                case 2:
                    System.out.println(" nhap vao so dien thang nay cua ban : ");
                    double soDien = sc.nextDouble();
                    Lesson2.tinhSoTienDien(soDien);
                    break;
                case 3:
                    System.out.println("Da thoat .");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
            System.out.println(); 
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            System.out.println("=============MENU============");
            System.out.println("| 1. Tinh phuong trinh bat hai |");
            System.out.println("| 2. Tinh tien dien hang thang |");
            System.out.println("| 3. EXIT                     |");
            System.out.print(" chon : ");
            int chose = sc.nextInt();
            displayMenu(chose);
       
    }
}
 