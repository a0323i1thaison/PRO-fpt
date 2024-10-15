/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author trang
 */
public class Employee {
    // Id, firstName, lastName, NgaySinh, soNgayLamViec, salary
    protected String empId;
    protected String firstName;
    protected String lastName;
    protected Date dob;
    protected int workingDay;
    protected double salary;

    public Employee(String empId, String firstName, String lastName, String dob, int workingDay) throws ParseException {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = setDob(dob);
        this.workingDay = workingDay;
    }
    

    

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    public String getDob() {
         SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(dob);
    }

    public Date setDob(String dob) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        return sdf.parse(dob);
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee" + "empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + getDob() + ", workingDay=" + workingDay + ", salary=" + salary + '}';
    }
    
    
}
