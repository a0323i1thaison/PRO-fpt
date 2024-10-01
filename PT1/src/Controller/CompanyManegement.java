/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Company;
import Model.Customer;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author thais
 */
public class CompanyManegement {
     Company company;
     Scanner scanner;
    public CompanyManegement(Company company){
        company = new Company();
        Scanner  scanner= new Scanner(System.in);
    }


    public void showMenu() {
        Company company = null ;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Display");
            System.out.println("2. FindCustomer");
            System.out.println("3. AddCustomer");
            System.out.println("4. ListDobCustomer");
            System.out.println("5. ChangePhoneNumber");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    company.printAllCustomers();
                    break;
                case 2:
                    System.out.print("Enter your ID: ");
                    int id = scanner.nextInt();
                    Customer customer = company.findCustomerByID(id);
                    System.out.println(customer != null ? customer : "not find .");
                    break;
                case 3:
                    System.out.print("Enter ID Customer: ");
                    int customerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter your name : ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Dob (dd-MM-yyyy): ");
                    String dob = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    try {
                        company.addCustomer(new Customer(customerID, name, phone, dob, address));
                    } catch (ParseException e) {
                        System.out.println("Invalid date of birth");
                    }
                    break;
                case 4:

                    break;
                case 5:
                    System.out.print("Enter ID Customer: ");
                    int idToChange = scanner.nextInt();
                    scanner.nextLine(); 
                    Customer customerToChange = company.findCustomerByID(idToChange);
                    if (customerToChange != null) {
                        System.out.print("Enter old phone number: ");
                        String oldPhone = scanner.nextLine();
                        System.out.print("Enter new phone number : ");
                        String newPhone = scanner.nextLine();
                        if (customerToChange.changePhone(oldPhone, newPhone)) {
                            System.out.println("finish");
                        } else {
                            System.out.println("phone number not true ");
                        }
                    } else {
                        System.out.println("not find customer .");
                    }
                    break;
                case 6:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("not choose.");
            }
        }
    }
 
}
