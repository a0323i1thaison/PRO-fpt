/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.student;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thais
 */
public class StudentManager {
    

    private List<Student> students = new ArrayList<>();

    public void displayStudent() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public void addStudent(int id, String name, String nganh, double gpa) {
        students.add(new Student(id, name, nganh, gpa));
    }

    public boolean deleteStudent(int id) {
        //
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("remove succefull");
                return true;
            }
        }

        System.out.println(" no student ");
        return false;
    }

    public void findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("student :" + s.toString());
            }
        }

    }

    public void rankStudent() {
        for (Student s : students) {
            if (s.getGpa() > 8.0) {
                System.out.println(s.getTen() + " gioi");
            } else if (s.getGpa() > 5.0) {
                System.out.println(s.getTen() + " kha");
            } else if (s.getGpa() >= 4.0) {
                System.out.println(s.getTen() + " trung binh");
            } else {
                System.out.println(s.getTen() + " hoc lai");
            }
        }
    }  
}
