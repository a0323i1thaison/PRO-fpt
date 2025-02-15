/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week1;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class TestWeek1 {
//    tìm kiếm 
//    public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Enter the number of elements in the array: ");
//        int n = scanner.nextInt();
//        
//        if (n <= 0) {
//            System.out.println("Please enter a positive number.");
//            return;
//        }
//        
//        LinearSearch linearSearch = new LinearSearch(n);
//       linearSearch.displayArray();
//        
//        System.out.print("Enter the number to search: ");
//        int searchNumber = scanner.nextInt();
//        
//        int index = linearSearch.linearSearch(searchNumber);
//        
//        if (index == -1) {
//            System.out.println("Number not found in the array.");
//        } else {
//            System.out.println("Number found at index: " + index);
//        }
//    } 
//    Chuyển đổi Số  
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Choose input base system: 1. Binary (2), 2. Decimal (10), 3. Hexadecimal (16)");
//            int inputChoice = scanner.nextInt();
//            int inputBase = getBase(inputChoice);
//            
//            System.out.println("Choose output base system: 1. Binary (2), 2. Decimal (10), 3. Hexadecimal (16)");
//            int outputChoice = scanner.nextInt();
//            int outputBase = getBase(outputChoice);
//            
//            scanner.nextLine(); 
//            System.out.print("Enter the number to convert: ");
//            String number = scanner.nextLine();
//            
//            try {
//                BaseConverter converter = new BaseConverter(inputBase, outputBase, number);
//                String result = converter.convert();
//                System.out.println("Converted value: " + result);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input number for the chosen base system.");
//            }
//            
//            System.out.print("Do you want to continue? (Y/N): ");
//            String choice = scanner.nextLine().trim().toUpperCase();
//            if (!choice.equals("Y")) {
//                break;
//            }
//        }
//        scanner.close();
//    }
//    
//    private static int getBase(int choice) {
//        return switch (choice) {
//            case 1 -> 2;
//            case 2 -> 10;
//            case 3 -> 16;
//            default -> throw new IllegalArgumentException("Invalid base choice.");
//        };
//    }
    
    }
    
