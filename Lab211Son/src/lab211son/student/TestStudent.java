/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.student;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class TestStudent {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       StudentManager st = new StudentManager();
       st.addStudent(1, "son", "CNTT", 5.5);
       st.addStudent(2, "dung", "CNTT", 6.5);     
       st.displayStudent();
       st.rankStudent();
    }
}
