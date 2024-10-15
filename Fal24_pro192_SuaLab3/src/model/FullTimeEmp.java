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
public class FullTimeEmp extends Employee{
    private int otHour;

    public FullTimeEmp( String empId, String firstName, String lastName, String dob, int workingDay, int otHour)throws ParseException  {
        super(empId, firstName, lastName, dob, workingDay);
        this.otHour = otHour;
    }

    public int getOtHour() {
        return otHour;
    }

    public void setOtHour(int otHour) {
        this.otHour = otHour;
    }

    @Override
    public String toString() {
        return  super.toString()+ "otHour=" + otHour;
    }
    
    
}
