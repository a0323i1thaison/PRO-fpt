/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab211son.Week4;

/**
 *
 * @author thais
 */
public class Teacher extends Person {

    private int profession;
    private String contractType;
    private Double salary;

    public Teacher() {
    }

    public Teacher(int profession, String contractType, Double salary) {
        this.profession = 0;
        this.contractType = "";
        this.salary = 0.0;
    }

    public Teacher(int profession, String contractType, Double salary, int id, String fullName, String phoneNumber, int year, String major) {
        super(id, fullName, phoneNumber, year, major);
        this.profession = profession;
        this.contractType = contractType;
        this.salary = salary;
    }
    public void InputAll(){
        
    }

    @Override
    public String toString() {
        return super.toString() + "profession=" + profession + ", contractType=" + contractType + ", salary=" + salary + '}';
    }
    
    

}
