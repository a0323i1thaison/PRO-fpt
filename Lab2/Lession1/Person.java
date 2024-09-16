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
public class Person {
    private int id ;
    private String name ;
    private boolean gender;

    public Person(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Person() {
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + id + name  + gender + '}';
    }

    
   
    public void scanInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID :" );
        int id = input.nextInt();
        setId(id);
        input.nextLine();

        
        System.out.println("Enter Name :" );
        String name = input.nextLine();
        setName(name);
        
        System.out.println("Enter Gender :" );
        boolean gender = input.nextBoolean();
        setGender(gender);
        
    }
    public void printInfo(){
        System.out.println("----------------");
        System.out.println("| ID | Name | Male |");
        System.out.printf("| %d | %s | %b |\ǹ̀",id,name,(gender ? "Nam" : "Nu"));
    }
    
}
