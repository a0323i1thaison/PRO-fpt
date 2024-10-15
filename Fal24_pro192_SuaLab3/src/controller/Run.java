
package controller;


import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Menu;
import view.Utils;

/**
 *
 * @author trang
 */
public class Run {
    public static void main(String[] args) {
        ManagerEmp mngEmp=new ManagerEmp();
        Menu.displayMenu();
        int choice=0;
        choice=Integer.parseInt(Utils.getValue("Please enter choice"));
        try {
            mngEmp.excute(choice);
            
        } catch (ParseException ex) {
            Logger.getLogger(ManagerEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
