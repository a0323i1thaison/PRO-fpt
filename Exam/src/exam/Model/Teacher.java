/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam.Model;

/**
 *
 * @author thais
 */
public class Teacher {
    private int idTeacher;
    private String nameTeacher;
    private boolean genderTeacher;
    private String classManage;

    public Teacher() {
    }

    public Teacher(int idTeacher, String nameTeacher, boolean genderTeacher, String classManage) {
        this.idTeacher = idTeacher;
        this.nameTeacher = nameTeacher;
        this.genderTeacher = genderTeacher;
        this.classManage = classManage;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public boolean isGenderTeacher() {
        return genderTeacher;
    }

    public void setGenderTeacher(boolean genderTeacher) {
        this.genderTeacher = genderTeacher;
    }

    public String getClassManage() {
        return classManage;
    }

    public void setClassManage(String classManage) {
        this.classManage = classManage;
    }
   
    
}
