/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author trang
 */
public class Company {
    private ArrayList<Employee> empList;

    public Company() throws ParseException {
        empList=new ArrayList();
        empList.add(new FullTimeEmp("A", "John", "Smith", "12/12/2000", 5,6) );
        empList.add(new PartTimeEmp("B", "Peter", "Smith", "01/02/2022", 7));
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    
}
