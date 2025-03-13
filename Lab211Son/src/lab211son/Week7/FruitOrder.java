/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thais
 */
public class FruitOrder {
    private String customerName;
    private List<Fruit> items;

    public FruitOrder(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }
    public String getCustomerName() {
        return customerName;
    }

    public void addItem(Fruit fruit, int quantity) {
        items.add(new Fruit(fruit.getId(), fruit.getName(), fruit.getPrice(), quantity, fruit.getOrigin()));
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName);
        double total = 0;
        System.out.println("| Product | Quantity | Price | Total |");
        for (Fruit fruit : items) {
            double amount = fruit.getPrice() * fruit.getQuantity();
            total += amount;
            System.out.printf("| %s | %d | %.2f$ | %.2f$ |\n", fruit.getName(), fruit.getQuantity(), fruit.getPrice(), amount);
        }
        System.out.println("Total: " + total + "$\n");
    }
}
