/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.SS2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thais
 */
public class Test {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] arr = generateRandomArray(size);
        
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(arr));
        
        QuickSort quickSort = new QuickSort(arr);
        quickSort.sort();
        
        System.out.println("Sorted array: ");
        quickSort.printArray();
        
        scanner.close();
    }
    
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Số ngẫu nhiên từ 0 - 99
        }
        return arr;
    }
}
