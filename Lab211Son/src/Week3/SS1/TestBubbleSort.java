/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.SS1;

import java.util.Scanner;

/**
 *
 * @author thais
 */
public class TestBubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        System.out.print("Enter the range for random numbers: ");
        int range = scanner.nextInt();

        BubbleSort bubbleSort = new BubbleSort(size, range);

        System.out.println("Unsorted array:");
        bubbleSort.displayArray();

        bubbleSort.sort();

        System.out.println("Sorted array:");
        bubbleSort.displayArray();

        scanner.close();
    }
}
