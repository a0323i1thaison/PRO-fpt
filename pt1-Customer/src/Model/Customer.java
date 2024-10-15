package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{
    protected String id;
    protected String name;
    protected String phone;
    protected Date dob;
    protected String address;

    public Customer(String id, String name, String phone, String dob, String address)throws ParseException{
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.dob = setDob(dob);
        this.address = address;
    }
//    public void changePhone(String oldPhone, String newPhone){
//        if (oldPhone.equals(this.phone) == true){
//            this.phone = newPhone;
//            System.out.println("Success");
//        }
//        else{
//            sout incorect
//        }
//    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dob); 
    }
    public Date setDob(String dob) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dob);
    }
    public String getAddress() {
        return address;
    }
    @Override
    public int compareTo(Customer c) {
        return this.name.compareToIgnoreCase(c.name);
    }
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", dob=" + getDob() + ", address=" + address + '}';
    }
    
}