/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Reponsitory;

import java.util.ArrayList;
import java.util.List;
import project.Model.Employee;
import project.Reponsitory.impl.IEmployeeRepo;
import project.Util.ReadAndWriterFile;

/**
 *
 * @author thais
 */
public class EmployeeRepository implements IEmployeeRepo<Employee>{
    private ReadAndWriterFile readAndWriteFileToCSV = new ReadAndWriterFile();
    private final String EMPLOYEE_DATA = "employee.csv";
    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToCSV());
        ReadAndWriterFile.writeToFile(EMPLOYEE_DATA, stringList, true);
    }

    @Override
    public void edit(List<String> stringList) {
        readAndWriteFileToCSV.writeToFile(EMPLOYEE_DATA, stringList, false);
    }

    @Override
    public void delete(List<String> stringList) {
        readAndWriteFileToCSV.writeToFile(EMPLOYEE_DATA, stringList, false);
    }


    @Override
    public List<Employee> getList() {
        List<String> stringList = readAndWriteFileToCSV.readFileCSV(EMPLOYEE_DATA);
        List<Employee> employeeList = new ArrayList<>();
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
            String level = array[7];
            String position = array[8];
            double salary = Double.parseDouble(array[9]);
            Employee employee = new Employee(name,sex, email,id, dateOfBirth, phoneNumber,CMND,level, position, salary);
            employeeList.add(employee);
        }
        return employeeList ;
    }
    
}
