
public class Sorting {

    public Sorting() {
    }

    //finding max element
    //selection sort: 
    void selectionSort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void insertionSort(int[] a) {
        int i, j, x;
        for (i = 1; i < a.length; i++) {
            x = a[i];
            j = i;
            while (j > 0 && a[j - 1] > x) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = x;
        }
    }

    void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;  // Mark that a swap occurred
                }
                printArray(array);
            }

            // If no swaps were made, the array is already sorted, so break early
            if (!swapped) {
                break;
            }
        }
    }

    /*
    quickSort idea: 
    divide and conquer
    +first la index cua phan tu dau
    +last la index cua phan tu cuoi
    steps:
        chon phan tu cuoi lam pivot, khong swap vi tri cua pivot nay
        sau do chia day lam 2 phan, ben trai la cac phan tu nho hon pivot, ben phai la cac phan tu lon hon pivot
        set hai chi so i, j voi j la bien chay va i chi chay khi a[j]<pivot bang loop
        khi j la phan tu cuoi cung thi dung loop
        swap pivot voi phan tu dau tien cua day ben phai, de pivot vao dung vi tri
        thuc hien de quy voi moi day
    
     */
    public int partition(int[] a, int first, int last) {
        int pivot = a[last];
        int i = first - 1;
        for (int j = first; j <= last; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //hoan doi pivot va phan tu dau tien cua day ben phai
        int temp = a[i + 1];
        a[i + 1] = a[last];
        a[last] = temp;
        return i + 1;
    }

    public void quickSort(int[] a, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(a, first, last);
            quickSort(a, first, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, last);
        }
    }

    /*
    mergesort idea:
    divide and conquer
    
    steps: (day = dãy)
        Chia dãy làm hai phần dựa theo chỉ số phần tử ở giữa.
        Thực hiện đệ quy việc chia đôi dãy cho đến khi chỉ còn 1 hoặc 2 phần tử.
        Sau đó, so sánh các phần tử trong các dãy con đã được chia.
        Gộp lại từng cặp 2 dãy con lần lượt bằng hai chỉ số i, j tăng dần bắt đầu từ 0 đến hết dãy, 
           trong đó nếu phần tử i nhỏ hơn hoặc bằng phần tử j thì thêm phần tử i vào dãy kết quả và tăng i,
           ngược lại thì thêm phần tử j và tăng j.
        Thực hiện đệ quy việc gộp từng cặp dãy cho đến khi được dãy hoàn chỉnh đã sắp xếp.
    
     */
    public void merge(int a[], int first, int last) {
        int mid = (first + last) / 2;
        int size1 = mid - first + 1;
        int size2 = last - mid;
        int[] a1 = new int[size1];
        int[] a2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            a1[i] = a[first + i];
        }
        for (int i = 0; i < size1; i++) {
            a2[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = first;
        while (i < size1 && j < size2) {
            if (a1[i] < a2[j]) {
                a[k++] = a1[i++];
            } else {
                a[k++] = a2[j++];
            }
        }
        while (i < size1) {
            a[k++] = a1[i++];
        }
        while (j < size2) {
            a[k++] = a2[j++];
        }
    }

    public void mergeSort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    private void mergeSort(int[] a, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;

            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);

            merge(a, first, last);
        }
    }

    /*
    heapSort idea:
        chuyển đổi array thành heap, trong đó quá trình chèn phần từ mới sao cho giữ nguyên tính chất của heap
        tạo biến k để dánh dấu
        swap root với phần tử cuối cùng của heap, khi đó ta có được phần tử cuối cùng đã sắp xếp đúng 
            -> biến đổi thành heap mới với root mới.
        thực hiện đệ quy các bước swap trên sao cho vẫn giữ nguyên được tính chất của heap, 
            cho đến khi còn lại phần tử nhỏ nhất làm root.
     */
    public void heapify(int[] a, int pIdx, int size) {
        int parentI = pIdx;
        int leftCI = parentI * 2 + 1;
        int rightCI = parentI * 2 + 2;
        if (leftCI < size && a[leftCI] > a[parentI]) {
            parentI = leftCI;
        }
        if (rightCI < size && a[rightCI] > a[parentI]) {
            parentI = rightCI;
        }
        if (parentI != pIdx) {
            int temp = a[pIdx];
            a[pIdx] = a[parentI];
            a[parentI] = temp;
            heapify(a, parentI, size);
        }
    }

    public void heapSort(int[] a) {
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, i, n);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, 0, i);
        }
    }

}
