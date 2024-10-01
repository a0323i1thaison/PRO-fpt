/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CompanyManegement;
import Model.Company;


/**
 *
 * @author thais
 */
public class Menu {
    public static void main(String[] args) {
       Company company = new Company();
       CompanyManegement manegement = new CompanyManegement(company ) ;
       manegement.showMenu();    
    } 
}
