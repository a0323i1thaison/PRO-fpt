/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week6.ManagementProgram;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thais
 */
public class ContactManage {
    private  List<Contact> contasts =  new ArrayList();
     public boolean  addContact (String fullName, String group, String address, String phone){
         Contact c = new Contact();
         contasts.add(c);
         return true ;
     }
     public void displayContact() {
    for (Contact c : contasts){
        System.out.println(c);       
    }
}
     public boolean deleteContact(int id){
         for (Contact c : contasts){
             if(c.getId()== id ){
                 contasts.remove(c);
                 return true ;
             }
             return false;
         }
        return false;
     }  
     
}  
