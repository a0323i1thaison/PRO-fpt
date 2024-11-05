/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Service;

import java.util.List;
import java.util.Scanner;
import project.Model.Customer;
import project.Reponsitory.CustomerRepository;
import project.Reponsitory.impl.ICustomerRepo;
import project.Util.CheckInputData;
import project.Util.Validation;
import project.Service.impl.ICustomerService;

/**
 *
 * @author thais
 */
public class CustomerService implements ICustomerService{
     private static final String NAME_CUSTOMER_VALID = "^([A-Z][a-z]{1,})((\\s[A-Z][a-z]{1,}){1,})$";
    private static final String EMAIL_CUSTOMER_VALID = "^[a-zA-z0-9]+@gmail.com";
    private static final String ID_CUSTOMER_VALID = "^(KH)(-)\\d{4}$";
    private static final String DATEOFBIRTH_CUSTOMER_VALID = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/\\d{4}$";
    private static final String PHONENUMBER_CUSTOMER_VALID = "^0\\d{9}$";
    private static final String CMND_CUSTOMER_VALID = "^\\d{9}(?:\\d{3})?$";
    private ICustomerRepo customerRepository = new CustomerRepository();
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
                String name = CheckInputData.checkInput("Please enter the Customer's name:",NAME_CUSTOMER_VALID, "Invalid name.Please re-enter." );
                String sex = CheckInputData.checkInputSex("Please enter Customer's sex:");
                String email = CheckInputData.checkInput("Please enter Customer email:", EMAIL_CUSTOMER_VALID, "Invalid email.Please re-enter.");
                String id = CheckInputData.checkInput("Please enter Customer id:", ID_CUSTOMER_VALID, "Invalid id.Please re-enter.");
                System.out.println("Enter date of birth:");
                String dateOfBirth = scanner.nextLine();
                String phoneNumber = CheckInputData.checkInput("Please enter Customer's phone number:", PHONENUMBER_CUSTOMER_VALID, "Invalid phone number.Please re-enter.");
                String CMND = CheckInputData.checkInput("Please enter Customer's ID number:", CMND_CUSTOMER_VALID, "Invalid ID. Please re-enter.");
                String address = CheckInputData.checkInputNull("Please enter Customer's address:", "address");
                String typeCustomer = CheckInputData.checkInputNull("Please enter the type of Customer:", "type");
                Customer customer = new Customer(name, sex, email, id, dateOfBirth, phoneNumber, CMND, address, typeCustomer);
                customerRepository.add(customer);
                System.out.println("Added successfully.");

                String mess = "Do you want to enter more?(Y/N)";
                if (Validation.confirm(mess)) {
                continue;
                } else {
                return;
                }
        }


    }

    @Override
    public void display() {
        List<Customer> customerList = customerRepository.getList();
        for (Customer cus : customerList) {
            System.out.println(cus.getInfoToCSV());
        }

    }

    @Override
    public void edit(String idEdit) {

    }

    @Override
    public void delete(String idDel) {

    }
}
