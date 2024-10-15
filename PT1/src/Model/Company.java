/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;





/**
 *
 * @author thais
 */
public class Company {
    private ArrayList<Customer> customers ; 
    public Company(){
        customers = new ArrayList<>();
        try{
            customers.add(new Customer("thaison","0928399393","23-09-2003","Da Nang", "Da Nang"));
            customers.add(new Customer("thaison1","0928399393","23-09-2003","Hai Phong", "Hai Phong"));
            customers.add(new Customer("thaison2","0928399393","23-09-2003","Quang Ninh", "Quang Ninh"));
            customers.add(new Customer("thaison3","0928399393","23-09-2003","Quang Tri", "Quang Tri"));
            customers.add(new Customer("thaison4","0928399393","23-09-2003","Quang Binh", "Quang Binh"));
        }catch(ParseException e ){ 
            e.printStackTrace();
        }
    }

     public ArrayList<Customer> getCtmList() {
        return customers ;
    }

    public void setCtmList(ArrayList<Customer>  customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Company{" + "ctmList=" + customers + '}';
    }
    
    public ArrayList<Customer> search(Predicate<Customer> p){
        ArrayList<Customer> rs = new ArrayList<>();
        for(Customer c : customers){
            if(p.test(c)) rs.add(c);
        }
        return rs;
    }
    public void sort(Comparator<Customer> c){
        Collections.sort(customers, c);
    }
}
