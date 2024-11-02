/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Reponsitory;

import java.util.ArrayList;
import java.util.List;
import project.Model.Customer;
import project.Reponsitory.impl.ICustomerRepo;
import project.Util.ReadAndWriterFile;

/**
 *
 * @author thais
 */
public class CustomerRepository implements ICustomerRepo<Customer>{
    private final String CUSTOMER_DATA = "customer.csv";
    private ReadAndWriterFile readAndWriteFile = new ReadAndWriterFile();
    @Override
    public List<Customer> getList() {
        List<String> stringList = readAndWriteFile.readFileCSV(CUSTOMER_DATA);
        List<Customer> customerList = new ArrayList<>();
        String[] array = null;
        for (String s: stringList) {
            array = s.split(",");
            String name = array[0];
            String sex = array[1];
            String email = array[2];
            String id = array[3];
            String dateOfBirth = array[4];
            String phoneNumber = array[5];
            String CMND = array[6];
            String address = array[7];
            String typeCustomer = array[8];
            Customer customer = new Customer(name,sex, email,id, dateOfBirth, phoneNumber,CMND,address, typeCustomer);
            customerList.add(customer);
        }
        return customerList ;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToCSV());
        ReadAndWriterFile.writeToFile(CUSTOMER_DATA, stringList, true);
    }

    @Override
    public void edit(List<String> stringList) {

    }

    @Override
    public void delete(List<String> stringList) {

    }

}
