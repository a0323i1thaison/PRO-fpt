/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author trang
 */
public class Utils {
    public static String getValue(String msg){
        System.out.println(msg);
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
}