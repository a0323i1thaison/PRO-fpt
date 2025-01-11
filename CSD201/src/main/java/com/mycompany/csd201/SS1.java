package com.mycompany.csd201;

/**
 *
 * @author thais
 */
public class SS1 {
    private int index;       
    private int capacity;    
    private int data[];      

    // Constructor có tham số
    public SS1(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.index = 0; 
    }

    // Constructor mặc định với capacity = 5
    public SS1() {
        this(5);
    }

    // Kiểm tra mảng có rỗng không
    boolean isEmpty() {
        return index == 0;
    }

    // Kiểm tra mảng có đầy không
    boolean isFull() {
        return index == capacity;
    }

    // Tăng kích thước mảng khi đầy
    void increaseSize() {
        int newCapacity = (int) (1.5 * capacity); // Tăng kích thước lên 1.5 lần
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < index; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
        capacity = newCapacity;
    }

    // Thêm phần tử vào cuối mảng
    void addL(int x) {
        if (isFull()) {
            increaseSize();
        }
        data[index] = x;
        index++;
    }

    // Thêm phần tử vào đầu mảng
    void addF(int x) {
        if (isFull()) {
            increaseSize();
        }
        for (int i = index; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = x; 
        index++;
    }
    // Thêm phẩn tử vào vị trí bất kỳ 
    void addIndex (int x , int index){
        if (index < 0 || index > this.index){
            System.out.println("out of index");
            return;
        }   if (isFull()) {
            increaseSize();
        }
        for (int i = this.index; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = x; 
        this.index++; 
        
            
    }

    // Hiển thị dữ liệu trong mảng
    void displayData() {
        for (int i = 0; i < index; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
  

   
}
