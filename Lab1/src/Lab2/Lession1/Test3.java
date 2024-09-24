/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Lession1;

import static Lab2.Lession1.Test2.printInfo;
import static Lab2.Lession1.Test2.scanInfo;
import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Test3 {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Nguyen Van A", true);
        Person p2 = new Person(2, "Nguyen Thi B", false);
        Person[] perArr = new Person[4];   
        perArr[0] = p1;
        perArr[1] = p2;
        Scanner input = new Scanner(System.in);
        for (int i = 2; i < perArr.length; i++) {
            System.out.print("Enter ID for Person " + (i + 1) + ": ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter Name for Person " + (i + 1) + ": ");
            String name = input.nextLine();
            System.out.print("Enter Gender (true for Nam, false for Nu) for Person " + (i + 1) + ": ");
            boolean gender = input.nextBoolean();
            perArr[i] = new Person(id, name, gender);
        }
        System.out.println("List of Persons: ");
        for (Person person : perArr) {
           printInfo(person);
        }
        
    }

}
