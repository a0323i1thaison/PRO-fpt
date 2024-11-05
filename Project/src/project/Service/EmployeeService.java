/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import project.Model.Employee;
import project.Reponsitory.EmployeeRepository;
import project.Reponsitory.impl.IEmployeeRepo;
import project.Service.impl.IEmployeeService;
import project.Util.CheckInputData;
import project.Util.Validation;

/**
 *
 * @author thais
 */
public class EmployeeService implements IEmployeeService{
    private static final String NAME_EMPLOYEE_VALID = "^([A-Z][a-z]{1,})((\\s[A-Z][a-z]{1,}){1,})$";
    private static final String EMAIL_EMPLOYEE_VALID = "^[a-zA-z0-9]+@gmail.com";
    public static final String ID_EMPLOYEE_VALID = "^(NV)(-)\\d{4}$";
    private static final String DATEOFBIRTH_EMPLOYEE_VALID = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/\\d{4}$";
    private static final String PHONENUMBER_EMPLOYEE_VALID = "^0\\d{9}$";
    private static final String CMND_EMPLOYEE_VALID = "^\\d{9}(?:\\d{3})?$";
    private IEmployeeRepo employeeRepository = new EmployeeRepository();


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           String name = CheckInputData.checkInput("Please enter Employee name:",NAME_EMPLOYEE_VALID, "Invalid name.Please re-enter." );
           String sex = CheckInputData.checkInputSex("Please enter Employee's sex:");
           String email = CheckInputData.checkInput("Please enter Employee email:", EMAIL_EMPLOYEE_VALID, "Invalid email.Please re-enter.");
           String id = CheckInputData.checkInput("Please enter employee id:", ID_EMPLOYEE_VALID, "Invalid id.Please re-enter.");
           System.out.println("Enter date of birth:");
           String dateOfBirth = scanner.nextLine();
           String phoneNumber = CheckInputData.checkInput("Please enter Employee's phone number:", PHONENUMBER_EMPLOYEE_VALID, "Invalid phone number.Please re-enter.");
           String CMND = CheckInputData.checkInput("Please enter Employee ID number:", CMND_EMPLOYEE_VALID, "Invalid ID. Please re-enter.");
           String level = CheckInputData.checkInputLevel("Please enter Employee level:");
           String position = CheckInputData.checkInputPosition("Please enter Employee position:");
           double salary = CheckInputData.checkInputMoney("Please enter Employee's salary:", 0);
           Employee employee= new Employee(name, sex, email, id, dateOfBirth, phoneNumber, CMND, level, position, salary);
           employeeRepository.add(employee);
            System.out.println("Added successfully.");
            String mess = "Do you want more?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }


        }
    }

    @Override
    public void display() {

        List<Employee> employeeList = employeeRepository.getList();
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void edit(String idEdit) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = employeeRepository.getList();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equalsIgnoreCase(idEdit)) {
                flag = true;
                System.out.println("Employee found.");
                while (true) {
                    System.out.println("1. Edit Employee name.");
                    System.out.println("2. Edit Employee gender.");
                    System.out.println("3. Edit Employee email.");
                    System.out.println("4. Edit Employee's date of birth.");
                    System.out.println("5. Edit Employee's phone number.");
                    System.out.println("6. Edit Employee ID");
                    System.out.println("7. Edit Employee level.");
                    System.out.println("8. Edit Employee position.");
                    System.out.println("9. Edit Employee's salary.");
                    int option = CheckInputData.CheckInputOption("\\Please enter the information you want to edit: " , 1, 9);
                    switch (option) {
                        case 1: {
                            employeeList.get(i).setName(CheckInputData.checkInput("Please edit your name:", NAME_EMPLOYEE_VALID, "Invalid name.Please re-enter."));
                            break;
                        }
                        case 2: {
                            employeeList.get(i).setSex(CheckInputData.checkInputSex("Please edit gender:"));
                            break;
                        }
                        case 3: {
                            employeeList.get(i).setEmail(CheckInputData.checkInput("Please edit Email:", EMAIL_EMPLOYEE_VALID, "Invalid email.Please re-enter."));
                            break;
                        }
                        case 4: {
                            System.out.println("Please correct your date of birth:");
                            employeeList.get(i).setDateOfBirth(scanner.nextLine());
                            break;
                        }
                        case 5: {
                            employeeList.get(i).setPhoneNumber(CheckInputData.checkInput("Please edit your phone number:", PHONENUMBER_EMPLOYEE_VALID, "Invalid phone number.Please re-enter."));
                            break;
                        }
                        case 6: {
                            employeeList.get(i).setCMND(CheckInputData.checkInput("Please correct your ID number:", CMND_EMPLOYEE_VALID, "Invalid ID. Please re-enter."));
                            break;
                        }
                        case 7: {
                            employeeList.get(i).setLevel(CheckInputData.checkInputLevel("Please edit your level:"));
                            break;
                        }
                        case 8: {
                            employeeList.get(i).setPosition(CheckInputData.checkInputPosition("Please edit location:"));
                            break;
                        }
                        case 9:{
                            employeeList.get(i).setSalary(CheckInputData.checkInputMoney("Please edit your salary:", 0));
                        }
                    }

                    System.out.println("Edited successfully.");
                    String mess = "Would you like to edit any other information (Y/N)?";
                    if (Validation.confirm(mess)) {
                        continue;
                    } else {
                        break;
                        // return là kêết thúc toàn bộ hàm.
                    }
                }
            }
        }
        for (Employee e: employeeList) {
            stringList.add(e.getInfoToCSV());
        }
        employeeRepository.edit(stringList);
        if (!flag) {
            System.out.println("No Employee found.");
        }


    }

    @Override
    public void delete(String idDel) {
        List<Employee> employeeList = employeeRepository.getList();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (!employeeList.get(i).getId().equals(idDel)) {
                stringList.add(employeeList.get(i).getInfoToCSV());
            }
        }
        String mess = "Are you sure you want to delete?(Y/N)";
        if (Validation.confirm(mess)) {
            employeeRepository.delete(stringList);
            if (employeeList.size() != stringList.size()) {
                System.out.println("Deleted successfully.");
            } else{
                System.out.println("No matching Employee found.");
            }
        } else {
            return;
        }


        }
}
