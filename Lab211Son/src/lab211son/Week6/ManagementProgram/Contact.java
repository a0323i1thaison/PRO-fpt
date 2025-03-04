/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week6.ManagementProgram;

/**
 *
 * @author thais
 */
public class Contact {
    private static int idCounter = 1;
    private int id ;
    private String fullName ;
    private String firstName;
    private String lastName;
    private String group;
    private String address;
    private String phone ;

    public Contact() {
        
    }

   public Contact(String fullName, String group, String address, String phone) {
        this.id = idCounter++;
        this.fullName = fullName;
        String[] nameParts = fullName.split(" ", 2);
        this.firstName = nameParts.length > 0 ? nameParts[0] : "";
        this.lastName = nameParts.length > 1 ? nameParts[1] : "";
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Contact.idCounter = idCounter;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

      @Override
    public String toString() {
        return id + "|" + fullName + "|" + firstName + "|" + lastName + "|" + group + "|" + address + "|" + phone;
    } 
}
