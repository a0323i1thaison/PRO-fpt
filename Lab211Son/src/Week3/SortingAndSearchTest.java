
import java.util.Random;
import java.util.Scanner;

public class SortingAndSearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println("Mảng ban đầu:");
        displayArray(array);

        // Chọn thuật toán sắp xếp
        System.out.println("Chọn thuật toán sắp xếp: 1 - Quick Sort, 2 - Bubble Sort");
        int choice = scanner.nextInt();

        if (choice == 1) {
            QuickSort sorter;
            sorter = new QuickSort(array);
            sorter.sort();
            System.out.println("Mảng sau khi sắp xếp bằng Quick Sort:");
        } else {
            BubbleSort sorter = new BubbleSort(array);
            sorter.sort();
            System.out.println("Mảng sau khi sắp xếp bằng Bubble Sort:");
        }
        displayArray(array);

        // Tìm kiếm nhị phân
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();
        int index = BinarySearch.search(array, target);

        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong mảng.");
        }
    }

    private static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}