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
public class Lesson1 {
    public static void pT2(double a,double b,double c ){
        if (a == 0) {
            System.out.println("He so 'a' khong duoc bang 0.");
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            // Hai nghiệm phân biệt
            double n1 = (-b + Math.sqrt(delta)) / (2 * a);
            double n2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("nghiem 1 :" + n1 + "nghiem 2:" + n2);
        } else if (delta == 0) {
            double n = -b / (2 * a);
            System.out.printf("Nghiem la duy nhat :" + n);
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hệ số
        System.out.print("Nhap he so  a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();

        // Gọi hàm giải phương trình bậc hai
        pT2(a, b, c);
       
    }
    
}
