/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam.Model;

/**
 *
 * @author thais
 */
public class Student {
    private int idStudent ;
    private String className ;
    private String nameStudent ;
    private boolean  gender;

    public Student() {
    }

    public Student(int idStudent, String className, String nameStudent, boolean gender) {
        this.idStudent = idStudent;
        this.className = className;
        this.nameStudent = nameStudent;
        this.gender = gender;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "idStudent=" + idStudent + ", className=" + className + ", nameStudent=" + nameStudent + ", gender=" + gender + '}';
    }
   
    
}
