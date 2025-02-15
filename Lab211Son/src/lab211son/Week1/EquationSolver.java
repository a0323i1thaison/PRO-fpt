/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author thais
 */
public class  EquationSolver {
    private float a, b, c;
    
    public EquationSolver(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public EquationSolver(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public List<Float> calculateEquation() {
        if (a == 0) {
            if (b == 0) return new ArrayList<>(); // Infinitely many solutions
            else return null; // No solution
        }
        return Collections.singletonList(-b / a);
    }
    
    public List<Float> calculateQuadraticEquation() {
        if (a == 0) return new EquationSolver(b, c).calculateEquation();
        
        float delta = b * b - 4 * a * c;
        if (delta < 0) return null; // No solution
        if (delta == 0) return Collections.singletonList(-b / (2 * a));
        
        List<Float> solutions = new ArrayList<>();
        solutions.add((float) ((-b + Math.sqrt(delta)) / (2 * a)));
        solutions.add((float) ((-b - Math.sqrt(delta)) / (2 * a)));
        return solutions;
    }
    
    public static boolean isOdd(float number) {
        return number % 2 != 0;
    }
    
    public static boolean isPerfectSquare(float number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }  
}
