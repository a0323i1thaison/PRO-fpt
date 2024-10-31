/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Collection;
import java.util.Collections;
import model.Company;
import java.util.Scanner;
import model.Employee;

/**
 *
 * @author thais
 */
public class EmployeeMenu extends Menu<String>{
    private Company company;
    private String filename = "emp.txt";

    public EmployeeMenu(String title, String[] options, Company company) {
        super(title, options);
        this.company = company;
    }

    @Override
    public void execute(int n) {
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1 -> company.listEmployees();
            case 2 -> searchMenu(sc);
            case 3 -> {
                sortBySalary();
                System.out.println("Sorted employees by salary.");
                company.listEmployees();
            }
            case 4 -> displayIncomes();
            case 5 -> {
                company.saveToFile(filename);
                System.out.println("Exiting program...");
            }
        }
    }

    private void searchMenu(Scanner sc) {
        System.out.println("Search by:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("3. DOB");
        System.out.println("4. Tax");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter value: ");
        String value = sc.nextLine();

        String criteria = switch (choice) {
            case 1 -> "id";
            case 2 -> "name";
            case 3 -> "dob";
            case 4 -> "tax";
            default -> "";
        };

        var results = company.searchBy(criteria, value);
        if (results.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : results) {
                System.out.println(emp);
            }
        }
    }

    private void displayIncomes() {
        for (Employee emp : company.getEmployees()) {
            double incomeAfterTax = emp.getSalary() - emp.calculateTax();
            System.out.printf("Employee %s has income after tax: %.2f%n", emp.getEmployeeID(), incomeAfterTax);
        }
    }

    private void sortBySalary() {
      
    }
}
