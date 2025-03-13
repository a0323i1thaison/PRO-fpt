/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week7;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class test {
    public static void main(String[] args) {
        FruitStore store = new FruitStore();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("1. Create Fruit");
            System.out.println("2. View Orders");
            System.out.println("3. Shopping");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> store.createFruit();
                case 2 -> store.viewOrders();
                case 3 -> store.shop();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
    
}
