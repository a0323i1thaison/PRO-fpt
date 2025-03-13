


public class TestSorting {

    public TestSorting() {
    }

    public static void main(String[] args){
        Sorting s = new Sorting();
        int[] array = {7,4,6,8,3,2,1,5,9};
        s.heapSort(array);
        s.printArray(array);
    }
}