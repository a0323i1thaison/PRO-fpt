/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Model;

/**
 *
 * @author thais
 */
public class Customer extends Person {
    private String address;
    private String typeCustomer;

    public Customer() {
    }

    public Customer(String address, String typeCustomer) {
        this.address = address;
        this.typeCustomer = typeCustomer;
    }

    public Customer(String name, String sex, String email, String id, String dateOfBirth, String phoneNumber, String CMND, String address, String typeCustomer) {
        super(name, sex, email, id, dateOfBirth, phoneNumber, CMND);
        this.address = address;
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + this.address + ";" + this.typeCustomer;
    }
    public String getInfoToCSV() {
        return this.getName() + "," + this.getSex() + "," + this.getEmail() + "," + this.getId() + "," + this.getDateOfBirth() + "," + this.getPhoneNumber() + " , " + this.getCMND() + " , " + this.address + " , " + this.typeCustomer  ;
    }
}
