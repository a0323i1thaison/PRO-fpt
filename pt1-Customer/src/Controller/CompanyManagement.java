package Controller;

import Model.Company;
import Model.Customer;
import View.Menu;
import View.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class CompanyManagement extends Menu {
    static String[] mainMenu = {
     "Add new Customer",
     "Print List of Customers",
     "Search Customer by different criteria",
     "Change Phone",
     "Statistics of customers with the same year of birth",
     "Sort Customers",  
     "Exit"
 };
    Company company;

    public CompanyManagement() throws ParseException {
        super("Manage customer", mainMenu);
        company = new Company();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                try {
                    addCTM();
                } catch (ParseException ex) {
                    System.out.println("Error while adding customer: " + ex.getMessage());
                }
                break;
            }
            case 2:
                printList(company.getCtmList());
                break;
            case 3:
                searchCustomer();
                break;
            case 4:
                changePhone();
                break;
            case 5:
                customerStatistical();
                break;
            case 6:
                sortCustomer();
                break;
            case 7:
                System.out.println("Exiting...");
                break;
            default:
                throw new AssertionError();
        }
    }

    void addCTM() throws ParseException {
        String id = Utils.getValue("Enter ID");
        String name = Utils.getValue("Enter Name");
        String phone = Utils.getValue("Enter Phone number");
        String dob = Utils.getValue("Enter day of birth ");
        String address = Utils.getValue("Enter Address");
        Customer ctm = new Customer(id, name, phone, dob, address);
        company.getCtmList().add(ctm);
    }

    public void printList(ArrayList<Customer> ctmList) {
        System.out.println("Customer list: \n");
        for (Customer e : ctmList) {
            System.out.println(e);
        }
    }
    public void sortCtm() {
        Collections.sort(company.getCtmList(), Comparator.comparing(Customer::getName));

        
        ArrayList<String> sortedNames = new ArrayList<>();


        for (Customer customer : company.getCtmList()) {
            sortedNames.add(customer.getName());
        }

        System.out.println("Sorted Customer Names:");
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
    public void searchCustomer() {
        String[] searchMenu = {"Search by ID", "Search by Name", "Search by Phone", "Search by DOB", "Search by Address"};
        Menu subMenu = new Menu("Search Customer", searchMenu) {

            @Override
            public void execute(int n) {
                ArrayList<Customer> rs = null;
                switch (n) {
                    case 1: {
                        String id = Utils.getValue("Enter ID");
                        rs = company.search(p -> p.getId().equals(id));
                        break;
                    }
                    case 2: {
                        String name = Utils.getValue("Enter Name");
                        rs = company.search(p -> p.getName().equalsIgnoreCase(name));
                        break;
                    }
                    case 3: {
                        String phone = Utils.getValue("Enter Phone");
                        rs = company.search(p -> p.getPhone().equals(phone));
                        break;
                    }
                    case 4: {
                        String dob = Utils.getValue("Enter DOB");
                        rs = company.search(p -> p.getDob().equals(dob));
                        break;
                    }
                    case 5: {
                        String address = Utils.getValue("Enter Address");
                        rs = company.search(p -> p.getAddress().equalsIgnoreCase(address));
                        break;
                    }
                    
                    default:
                        System.out.println("Invalid search criteria.");
                        return;
                }
            }
        };

        subMenu.run();
    }
    public void sortCustomer(){
        String[] sortMenu = {"Sort by ID", "Sort by Name", "Sort by Phone", "Sort by DOB", "Sort by Address"};
        Menu subMenu = new Menu("Sort Customer", sortMenu){
            @Override
            public void execute(int n) {
               
                switch(n){
                    case 1: {
                         company.sort((b1,b2)->b1.getId().compareTo(b2.getId()));
                        break;
                    }
                    case 2: {
                        company.sort((b1,b2)->b1.getName().compareTo(b2.getName()));
                        break;
                    }
                    case 3: {
                        company.sort((b1,b2)->b1.getPhone().compareTo(b2.getPhone()));
                        break;
                    }
                    case 4: {
                        company.sort((b1,b2)->b1.getDob().compareTo(b2.getDob()));
                        break;
                    }
                    case 5: {
                        company.sort((b1,b2)->b1.getAddress().compareTo(b2.getAddress()));
                        break;
                    }
                    case 6:{
                        System.out.println("PRESS 6 to return");
                    }
                }
            }
            
        };
        subMenu.run();
        
    }
    public void changePhone() {
        String id = Utils.getValue("Enter Customer ID:");

        Customer foundCustomer = null;
        for (Customer customer : company.getCtmList()) {
            if (customer.getId().equals(id)) {
                foundCustomer = customer;
                break;
            }
        }

        if (foundCustomer != null) {
            String oldPhone = Utils.getValue("Enter the current phone number:");
            if (foundCustomer.getPhone().equals(oldPhone)) {
                String newPhone = Utils.getValue("Enter the new phone number:");
                foundCustomer.setPhone(newPhone);
                System.out.println("Phone number updated successfully to: " + newPhone);
            } else {
                System.out.println("The old phone number doesn't match.");
            }
        } else {
            System.out.println("Customer not found with ID: " + id);
        }
    }

    public void customerStatistical() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        Map<String, Integer> countByBirthYear = new HashMap<>();
        for (Customer cs : company.getCtmList()) {
            String year = df.format(cs.getDob());

            if (countByBirthYear.containsKey(year)) {
                int count = countByBirthYear.get(year);
                countByBirthYear.put(year, count + 1);
            } else {
                countByBirthYear.put(year, 1);
            }
        }

        for (String year : countByBirthYear.keySet()) {
            System.out.println(year + ": " + countByBirthYear.get(year));
        }
    }
}