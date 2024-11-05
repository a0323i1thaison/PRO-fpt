/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Util;

import java.util.Scanner;
import project.Reponsitory.EmployeeRepository;
import project.Reponsitory.impl.IEmployeeRepo;

/**
 *
 * @author thais
 */
public class Validation {
     private static IEmployeeRepo employeeRepository = new EmployeeRepository();
  private static Scanner scanner = new Scanner(System.in);


  public static boolean confirm(String mess) {
    while (true) {
      System.out.println(mess);
      String option = scanner.nextLine();
      if (option.equalsIgnoreCase("Y")) {
        return true;
      } else if (option.equalsIgnoreCase("N")) {
        return false;
      } else {
        System.out.println("You must enter Y or N");
      }
    }
  }
    
}
