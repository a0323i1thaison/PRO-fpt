/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211son.Week2.SS2;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class TestShapeCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input side width of Rectangle:");
        double width = scanner.nextDouble();
        System.out.println("Please input length of Rectangle:");
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, length);
        
        System.out.println("Please input radius of Circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        
        System.out.println("Please input side A of Triangle:");
        double sideA = scanner.nextDouble();
        System.out.println("Please input side B of Triangle:");
        double sideB = scanner.nextDouble();
        System.out.println("Please input side C of Triangle:");
        double sideC = scanner.nextDouble();
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
        
        scanner.close();
    }
    
}
