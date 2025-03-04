/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week5;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Week5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first large number: ");
        String num1 = scanner.nextLine();
        System.out.print("Enter second large number: ");
        String num2 = scanner.nextLine();
        LargeNumber operations = new LargeNumber();
        String sum = operations.addLargeNumbers(num1, num2);
        String product = operations.multiplyLargeNumbers(num1, num2);
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
    }
    
}
