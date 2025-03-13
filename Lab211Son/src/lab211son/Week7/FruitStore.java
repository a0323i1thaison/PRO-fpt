/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author thais
 */
public class FruitStore {
    private List<Fruit> fruits = new ArrayList<>();
    private List<FruitOrder> orders = new ArrayList<>();
    private int fruitIdCounter = 1;
    private Scanner scanner = new Scanner(System.in);

    public void createFruit() {
        
        
        
        
        
        
        
        
        
        

//        while (true) {
//            System.out.print("Enter Fruit Name: ");
//            String name = scanner.nextLine();
//            System.out.print("Enter Price: ");
//            double price = validateDouble();
//            System.out.print("Enter Quantity: ");
//            int quantity = validateInt();
//            System.out.print("Enter Origin: ");
//            String origin = scanner.nextLine();
//            fruits.add(new Fruit(fruitIdCounter++, name, price, quantity, origin));
//            System.out.print("Do you want to continue (Y/N)? ");
//            if (!scanner.nextLine().equalsIgnoreCase("Y")) break;
//        }
    }

    public void displayFruits() {
        System.out.println("| ID | Product | Origin | Price | Quantity |");
        for (Fruit fruit : fruits) {
            System.out.printf("| %d | %s | %s | %.2f$ | %d |\n", fruit.getId(), fruit.getName(), fruit.getOrigin(), fruit.getPrice(), fruit.getQuantity());
        }
    }

    public void shop() {
        FruitOrder order = new FruitOrder(getCustomerName());
        while (true) {
            displayFruits();
            System.out.print("Select Fruit by ID: ");
            int fruitId = validateInt();
            Fruit selectedFruit = getFruitById(fruitId);
            if (selectedFruit == null) {
                System.out.println("Invalid selection.");
                continue;
            }
            System.out.print("Enter Quantity: ");
            int quantity = validateInt();
            if (quantity > selectedFruit.getQuantity()) {
                System.out.println("Not enough stock.");
                continue;
            }
            selectedFruit.reduceQuantity(quantity);
            order.addItem(selectedFruit, quantity);
            System.out.print("Do you want to order now (Y/N)? ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                orders.add(order);
                System.out.println("Order placed successfully!");
                break;
            }
        }
    }

    public void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }
        for (FruitOrder order : orders) {
            order.displayOrder();
        }
    }

    private Fruit getFruitById(int id) {
        for (Fruit fruit : fruits) {
            if (fruit.getId() == id) return fruit;
        }
        return null;
    }

    private String getCustomerName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    private int validateInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); 
        return value;
    }

    private double validateDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Enter a valid number: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
    
}
