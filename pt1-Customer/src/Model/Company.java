package Model;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class Company {
    private ArrayList<Customer> ctmList;

    public Company() throws ParseException {
        ctmList = new ArrayList<>();
        ctmList.add(new Customer("201", "B", "0901234567", "15/01/1990", "123 Nguyen trai"));
        ctmList.add(new Customer("202", "F", "0901234568", "20/05/1992", "456 Nguyen trai"));
        ctmList.add(new Customer("203", "A", "0901234569", "10/10/1990", "789 Nguyen trai"));
        ctmList.add(new Customer("204", "D", "0901234570", "01/01/1985", "321 Nguyen trai"));
        ctmList.add(new Customer("205", "N", "0901234571", "30/08/1995", "654 Nguyen trai"));
    }

    public ArrayList<Customer> getCtmList() {
        return ctmList;
    }

    public void setCtmList(ArrayList<Customer> ctmList) {
        this.ctmList = ctmList;
    }

    @Override
    public String toString() {
        return "Company{" + "ctmList=" + ctmList + '}';
    }
    
    public ArrayList<Customer> search(Predicate<Customer> p){
        ArrayList<Customer> rs = new ArrayList<>();
        for(Customer c : ctmList){
            if(p.test(c)) rs.add(c);
        }
        return rs;
    }
    public void sort(Comparator<Customer> c){
        Collections.sort(ctmList, c);
    }
        
    
}