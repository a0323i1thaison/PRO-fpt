/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week2.SS1;

/**
 *
 * @author thais
 */
public class Calculator {
    private Double memory;

    public Calculator(Double memory) {
        this.memory = memory;
    }
     public Calculator() {
        this.memory = 0.0;
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }
     
    public double calculate(double a, String operator, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Không thể chia cho 0.");
                return a / b;
            case "^":
                return Math.pow(a, b);
            default:
                throw new IllegalArgumentException("Toán tử không hợp lệ.");
        }
    }
    
    
}
