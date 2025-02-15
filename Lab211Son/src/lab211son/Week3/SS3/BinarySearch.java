/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab211son.Week3.SS3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author thais
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch(int size, int maxValue) {
        array = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(maxValue) + 1;
        }
        Arrays.sort(array);
    }

    public int binarySearch(int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void displayArray() {
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
