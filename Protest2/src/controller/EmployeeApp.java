/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Company;
import view.EmployeeMenu;



public class EmployeeApp {
public static void main(String[] args) {
        Company company = new Company();
        company.loadFromFile("emp.txt");

        String[] menuOptions = {
            "List Employees",
            "Search Employees",
            "Sort by Salary",
            "Display incomes",
            "Quit"
        };
        EmployeeMenu menu = new EmployeeMenu("Employee Management Menu", menuOptions, company);
        menu.run();
    }
}
