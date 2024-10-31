/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Employee;

/**
 *
 * @author thais
 */
public class FileHandler {
     private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public FileHandler() {
        dateFormat.setLenient(false);
    }

    
    public ArrayList<Employee> readEmployeesFromFile(String filename) {
        ArrayList<Employee> employees = new ArrayList<>();
        File file = new File(filename);

      
        if (!file.exists()) {
            System.out.println("File not exist: " + filename);
            return employees;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length != 4) {
                    System.out.println("Not format: " + line);
                    continue;
                }
                try {
                    String employeeID = data[0];
                    String name = data[1];
                    Date dob = dateFormat.parse(data[2]);
                    double salary = Double.parseDouble(data[3]);

                    if (!employeeID.matches("^Emp\\d{3}$")) {
                        System.out.println("Not format  EmployeeID: " + employeeID);
                        continue;
                    }

                    employees.add(new Employee(employeeID, name, dob, salary));
                } catch (ParseException | NumberFormatException e) {
                    System.out.println("data stream error: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename + ".Detail: " + e.getMessage());
        }
        return employees;
    }


    public void writeEmployeesToFile(String filename, ArrayList<Employee> employees) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (Employee emp : employees) {
                String dob = dateFormat.format(emp.getDob());
                pw.printf("%s,%s,%s,%.2f%n", emp.getEmployeeID(), emp.getName(), dob, emp.getSalary());
            }
            System.out.println("Saved employee list to file " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filename + ". Detailt: " + e.getMessage());
        }
    }
}
