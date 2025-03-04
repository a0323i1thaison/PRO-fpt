/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week6.ManagementProgram;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManage manager = new ContactManage();
        while (true) {
            System.out.println("========= Contact program =========");
            System.out.println("1. Add a Contact");
            System.out.println("2. Display all Contacts");
            System.out.println("3. Delete a Contact");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Full Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter Group: ");
                    String group = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    manager.addContact(fullName, group, address, phone);
                    break;               
                case 2:
                    manager.displayContact();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    if (scanner.hasNextInt()) {
                        int id = scanner.nextInt();
                        manager.deleteContact(id);
                    } else {
                        System.out.println("ID must be a number.");
                        scanner.next();
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
