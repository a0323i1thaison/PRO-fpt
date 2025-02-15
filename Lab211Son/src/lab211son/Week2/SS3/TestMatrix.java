/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week2.SS3;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class TestMatrix {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMatrix Calculator:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();

            Matrix matrix1 = new Matrix(rows, cols);
            matrix1.fillMatrix(scanner);

            Matrix matrix2 = new Matrix(rows, cols);
            matrix2.fillMatrix(scanner);

            try {
                Matrix result = switch (choice) {
                    case 1 -> matrix1.add(matrix2);
                    case 2 -> matrix1.subtract(matrix2);
                    case 3 -> matrix1.multiply(matrix2);
                    default -> throw new IllegalArgumentException("Invalid choice");
                };

                System.out.println("Result:");
                result.printMatrix();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
    
}
