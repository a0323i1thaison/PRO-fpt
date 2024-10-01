/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



/**
 *
 * @author thais
 */
public class Company {
    private List<Customer> customers ; 
    public Company(){
        customers = new ArrayList<>();
        try{
            customers.add(new Customer(01,"thai son","0928399393","23-09-2003","Da Nang"));
            customers.add(new Customer(02,"thai son1","0928399393","23-09-2003","Hai Phong"));
            customers.add(new Customer(03,"thai son2","0928399393","23-09-2003","Quang Ninh"));
            customers.add(new Customer(04,"thai son3","0928399393","23-09-2003","Quang Tri"));
            customers.add(new Customer(05,"thai son4","0928399393","23-09-2003","Quang Binh"));
        }catch(ParseException e ){ 
            e.printStackTrace();
        }
    }

    public Customer findCustomerByID(int customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID()==(customerID)) {
                return customer;
            }
        }
        return null;
    }

    public void printAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomersByBirthYear(int year) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(customer.getDob());
            if (cal.get(Calendar.YEAR) == year) {
                result.add(customer);
            }
        }
        return result;
    }  
}
