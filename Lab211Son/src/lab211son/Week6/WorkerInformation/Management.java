/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week6.WorkerInformation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author thais
 */
public class Management {
     private List<Worker> workers = new ArrayList<>();
    private List<SalaryHistory> salaryHistories = new ArrayList<>();

    public boolean addWorker(Worker worker) {
        for (Worker w : workers) {
            if (w.id.equals(worker.id)) {
                System.out.println("Error: Worker ID already exists.");
                return false;
            }
        }
        if (worker.age < 18 || worker.age > 50 || worker.salary <= 0) {
            System.out.println("Error: Invalid worker details.");
            return false;
        }
        workers.add(worker);
        System.out.println("Worker added successfully.");
        return true;
    }

    public boolean changeSalary(String status, String code, double amount) {
        for (Worker w : workers) {
            if (w.id.equals(code)) {
                if (amount <= 0) {
                    System.out.println("Error: Amount must be greater than zero.");
                    return false;
                }
                double newSalary = status.equals("UP") ? w.salary + amount : w.salary - amount;
                if (newSalary < 0) {
                    System.out.println("Error: Salary cannot be negative.");
                    return false;
                }
                w.salary = newSalary;
                salaryHistories.add(new SalaryHistory(w.id, w.name, w.age, w.salary, status, new Date().toString()));
                System.out.println("Salary updated successfully.");
                return true;
            }
        }
        System.out.println("Error: Worker ID not found.");
        return false;
    }

    public void getInformationSalary() {
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.println("Code\tName\tAge\tSalary\tStatus\tDate");
        for (SalaryHistory s : salaryHistories) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.age + "\t" + s.salary + "\t" + s.status + "\t" + s.date);
        }
    }
    
}
