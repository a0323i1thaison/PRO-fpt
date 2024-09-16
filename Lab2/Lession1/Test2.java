/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Lession1;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Test2 {
    
    public static void main(String[] args) {
         Person p = new Person();
        p.scanInfo();
        p.printInfo();
    }
    public static void scanInfo(Person p){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID :" );
        int id = input.nextInt();
        p.setId(id);
        input.nextLine();

        
        System.out.println("Enter Name :" );
        String name = input.nextLine();
        p.setName(name);
        
        System.out.println("Enter Gender true for Nam or false for Nu :" );
        boolean gender = input.nextBoolean();
        p.setGender(gender) ;
        
    }
    public static void printInfo(Person p){
        System.out.println("----------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\ǹ̀",
                p.getId(),p.getName(),(p.isGender()? "true for Nam": "false for Nu"));
    }
    
}   
