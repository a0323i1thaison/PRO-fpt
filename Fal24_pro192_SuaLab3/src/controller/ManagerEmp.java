/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Company;
import model.Employee;
import model.FullTimeEmp;
import model.PartTimeEmp;
import view.Menu;
import view.Utils;

/**
 *
 * @author trang
 */
public class ManagerEmp {
    Company com;

    public ManagerEmp() {
        try {
            com=new Company();
        } catch (ParseException ex) {
            Logger.getLogger(ManagerEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  void excute(int choice) throws ParseException{
        switch(choice){
            case 1: inputEmp();break;
            case 2: displayEmpList();break;
        }
    }
    

    private  void inputEmp() throws ParseException{
        String id = Utils.getValue("Please enter Id of Emp");
        String firstName = Utils.getValue("Please enter First Name of Emp");
        String lastName = Utils.getValue("Please enter Last Name of Emp");
        String dob= Utils.getValue("Please enter date of birht of Emp");
        int workingDay= Integer.parseInt(Utils.getValue("Please enter Id of Emp"));
       Menu.displaysubMenu();
       int empType=0;
       Menu.displaysubMenu();
       empType=Integer.parseInt(Utils.getValue("Please enter type of Emp"));
       
       if(empType==1){
           int otHour= Integer.parseInt(Utils.getValue("Please enter OT hour of Emp"));
           FullTimeEmp fullEmp=new FullTimeEmp(id, firstName, lastName, dob, workingDay, otHour);
           com.getEmpList().add(fullEmp);
           
       }
       else if(empType==2){
           PartTimeEmp partEmp=new PartTimeEmp(id,firstName, lastName, dob, workingDay);
           com.getEmpList().add(partEmp);
       }
           
            
    }

    private void displayEmpList() {
        for(Employee e:com.getEmpList()){
            System.out.println(e);
        }
      
        
    }
}
