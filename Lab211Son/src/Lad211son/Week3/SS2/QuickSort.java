/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lad211son.Week3.SS2;

import java.util.Arrays;

/**
 *
 * @author thais
 */
public class QuickSort {
     private int[] arr;
    
    public QuickSort(int[] arr) {
        this.arr = arr;
    }
    
    public void sort() {
        quickSort(0, arr.length - 1);
    }
    
    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }
    
    private int partition(int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }
    
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
    
}
