/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week1;

/**
 *
 * @author thais
 */
public class BaseConverter {
     private int inputBase;
    private int outputBase;
    private String number;
    
    public BaseConverter(int inputBase, int outputBase, String number) {
        this.inputBase = inputBase;
        this.outputBase = outputBase;
        this.number = number;
    }
    
    public String convert() {
        int decimalValue = Integer.parseInt(number, inputBase);
        return Integer.toString(decimalValue, outputBase).toUpperCase();
    }
}
