/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.controller;


import java.util.Scanner;
import lab5.model.Bi_Store;
import lab5.model.Bicycle;
import lab5.view.Menu;

/**
 *
 * @author thais
 */
public class StoreManagement {
    private Bi_Store biStore;
    private Scanner scanner;

    public StoreManagement() {
        biStore = new Bi_Store("bicycles.txt"); 
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            Menu.printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayAll();
                    break;
                case 2:
                    doAddBicycle();
                    break;
                case 3:
                    doDeleteBicycle();
                    break;
                case 4:
                    Bicycle leastTimeBicycle = biStore.searchLeastTimeToMove();
                    if (leastTimeBicycle != null) {
                        System.out.println("Bicycle with least time to move: " + leastTimeBicycle);
                    } else {
                        System.out.println("No bicycles found.");
                    }
                    break;
                case 5:
                    biStore.printBicyclesByProductionYear();
                    break;
                case 6:
                    biStore.saveToFile("bicycles.txt");
                    System.out.println("Bicycles saved to file.");
                    break;
                case 7:
                    biStore.loadFromFile("bicycles.txt");
                    System.out.println("Bicycles loaded from file.");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
     public void doAddBicycle() {
        System.out.print("Enter Bicycle ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Speed: ");
        int speed = scanner.nextInt();

        System.out.print("Enter Distance: ");
        double distance = scanner.nextDouble();

        System.out.print("Is Electric (true/false): ");
        boolean isElectric = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Production Date (dd/MM/yyyy): ");
        String productionDate = scanner.nextLine();

        Bicycle newBicycle = new Bicycle(id, speed, distance, isElectric, productionDate);
        biStore.addBicycle(newBicycle);
        System.out.println("Bicycle added successfully.");
    }

    public void doDeleteBicycle() {
        System.out.print("Enter Bicycle ID to delete: ");
        String id = scanner.nextLine();
        biStore.deleteBicycle(id);
        System.out.println("Bicycle deleted successfully.");
    }

    public void displayAll() {
        System.out.println("Bicycles sorted by speed:");
        biStore.getBicycles().stream()
                .sorted((b1, b2) -> Integer.compare(b1.getSpeed(), b2.getSpeed()))
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        StoreManagement management = new StoreManagement();
        management.displayMenu();
    }
    
}
