/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Lession1;

import static Lab2.Lession1.Test2.printInfo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Test4 {
    public static void findByName(ArrayList<Person> list, String name) {
        boolean a = false ;
        for (Person person : list  ){
            if(person.getName().equals(name) ){
                System.out.println("person is :" +person );
                a = true;
                break;
            }
        }
        if(!a){
            System.out.println("not found");
        }
    }

    public static void sortByName (String name) {
        

    }
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person(1, "Nguyen Van A", true);
        Person p2 = new Person(2, "Nguyen Thi B", false);
        list.add(p1);
        list.add(p2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of additional persons to add: ");
        int number = input.nextInt();
        input.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.print("Enter ID for Person " + (i + 3) + ": ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter Name for Person " + (i + 3) + ": ");
            String name = input.nextLine();
            System.out.print("Enter Gender (true for Nam, false for Nu) for Person " + (i + 3) + ": ");
            boolean gender = input.nextBoolean();
            list.add(new Person(id, name, gender));
        }
        System.out.println("List of Persons: ");
        for (Person person : list) {
            printInfo(person);
        }
        // tìm kiếm theo tên 
        String findName ;
        System.out.println(" Enter your Name :  ");
        findName = input.nextLine();
        findByName(list, findName);
    }

}
