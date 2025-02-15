/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab211son.Week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author thais
 */
public class StudentManagement {
    
    private static final List<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("WELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createStudent();
                    break;
                case 2:
                    findAndSortStudent();
                    break;
                case 3:
                    updateOrDeleteStudent();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void createStudent() {
        while (true) {
            System.out.print("Enter ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Semester: ");
            String semester = scanner.nextLine();
            System.out.print("Enter Course (Java, .Net, C/C++): ");
            String course = scanner.nextLine();
            students.add(new Student(id, name, semester, course));

            if (students.size() >= 3) {
                System.out.print("Do you want to continue (Y/N)? ");
                if (!scanner.nextLine().equalsIgnoreCase("Y")) {
                    break;
                }
            }
        }
    }

    private static void findAndSortStudent() {
        System.out.print("Enter student name (or part of name): ");
        String name = scanner.nextLine();
        List<Student> foundStudents = new ArrayList<>();

        for (Student s : students) {
            if (s.name.toLowerCase().contains(name.toLowerCase())) {
                foundStudents.add(s);
            }
        }

        foundStudents.sort(Comparator.comparing(s -> s.name));
        foundStudents.forEach(System.out::println);
    }

    private static void updateOrDeleteStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        Student found = null;
        for (Student s : students) {
            if (s.id.equals(id)) {
                found = s;
                break;
            }
        }

        if (found == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Do you want to update (U) or delete (D) student? ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("U")) {
            System.out.print("Enter new Name: ");
            found.name = scanner.nextLine();
            System.out.print("Enter new Semester: ");
            found.semester = scanner.nextLine();
            System.out.print("Enter new Course: ");
            found.course = scanner.nextLine();
        } else if (choice.equalsIgnoreCase("D")) {
            students.remove(found);
        }
    }

    private static void generateReport() {
        Map<String, Map<String, Integer>> report = new HashMap<>();

        for (Student s : students) {
            report.putIfAbsent(s.name, new HashMap<>());
            report.get(s.name).put(s.course, report.get(s.name).getOrDefault(s.course, 0) + 1);
        }

        for (var entry : report.entrySet()) {
            for (var courseEntry : entry.getValue().entrySet()) {
                System.out.println(entry.getKey() + " | " + courseEntry.getKey() + " | " + courseEntry.getValue());
            }
        }
    }
}
