/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab211son.Week3.SS3;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Test {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        System.out.print("Enter the maximum value for elements: ");
        int maxValue = scanner.nextInt();
        
        BinarySearch search = new BinarySearch(size, maxValue);
        search.displayArray();
        
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();
        
        int result = search.binarySearch(target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
    
}
