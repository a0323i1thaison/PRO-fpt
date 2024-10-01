/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thais
 */
public class Customer {
    protected int customerID ;
    protected String name ;
    protected String phone ;
    protected Date dob ;
    protected String address ;
     public Customer(int customerID, String name, String phone, String dob, String address) throws ParseException {
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
        this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(dob); 
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(String dob) throws ParseException {
        this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Custumer: " + "ID:" + customerID + " Name:" + name + " Phone:" + phone + "Dob:" + dob + " Address:" + address;
    }
     public boolean changePhone(String oldPhone, String newPhone) {
        if (this.phone.equals(oldPhone)) {
            this.phone = newPhone;
            return true;
        }
        return false;
    }
}
