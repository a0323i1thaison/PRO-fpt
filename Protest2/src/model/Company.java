/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import controller.FileHandler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import model.Employee;


public class Company {
    private ArrayList<Employee> employees;
    private FileHandler fileHandler;

    public Company() {
        employees = new ArrayList<>();
        fileHandler = new FileHandler();
    }

    public void loadFromFile(String filename) {
        employees = fileHandler.readEmployeesFromFile(filename);
    }

    public void saveToFile(String filename) {
        fileHandler.writeEmployeesToFile(filename, employees);
    }

    public void listEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    public void sortBySalary(){
        Collections.sort(employees);
    }

    public ArrayList<Employee> searchBy(String criteria, String value) {
        ArrayList<Employee> results = new ArrayList<>();
        for (Employee emp : employees) {
            switch (criteria.toLowerCase()) {
                case "id" -> { if (emp.getEmployeeID().equals(value)) results.add(emp); }
                case "name" -> { if (emp.getName().contains(value)) results.add(emp); }
                case "dob" -> { if (new SimpleDateFormat("dd/MM/yyyy").format(emp.getDob()).equals(value)) results.add(emp); }
                case "tax" -> { if (String.valueOf(emp.calculateTax()).equals(value)) results.add(emp); }
            }
        }
        return results;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
