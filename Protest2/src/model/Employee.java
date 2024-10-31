/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thais
 */
public class Employee implements Comparable<Employee>{
    private String employeeID;
    private String name;
    private Date dob;
    private double salary;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Employee(String employeeID, String name, Date dob, double salary) {
        if (!employeeID.matches("^Emp\\d{3}$")) throw new IllegalArgumentException("Invalid EmployeeID format");
        this.employeeID = employeeID;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public String getEmployeeID() { return employeeID; }
    public String getName() { return name; }
    public Date getDob() { return dob; }
    public double getSalary() { return salary; }

    public double calculateTax() {
        if (salary < 9000000) return 0;
        else if (salary <= 15000000) return salary * 0.1;
        else return salary * 0.12;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | DOB: %s | Salary: %.2f | Tax: %.2f",
            employeeID, name, dateFormat.format(dob), salary, calculateTax());
    }
}
