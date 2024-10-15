/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author trang
 */
public class PartTimeEmp extends Employee{
    private static final float DISCOUNT=0.5f;

    public PartTimeEmp(String empId, String firstName, String lastName, String dob, int workingDay) throws ParseException {
        super(empId, firstName, lastName, dob, workingDay);
    }

   

    @Override
    public String toString() {
        return super.toString() + "DISCOUNT=" + DISCOUNT ;
    }

    
    
}
