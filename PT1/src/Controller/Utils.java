/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Utils {
     public static String getValue(String msg) {
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getIntValue(String msg) { 
        Scanner sc = new Scanner(System.in);
        System.out.println(msg); 
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                value = Integer.parseInt(sc.nextLine());
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid integer.");
            }
        }
        return value;
    }
    
}
