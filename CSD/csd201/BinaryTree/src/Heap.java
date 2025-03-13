
public class Heap { //using array to implement

    int[] keys;
    int max; //heap size
    int lastIndex;
    
    public Heap(int max1) {
        max= max1;
        keys = new int[max];
        lastIndex=-1;
    }
    
    public Heap(){
    
        this(20);
    }
    
    public boolean isEmpty(){
        return (lastIndex==-1);
    }
    
    public boolean isFull(){
        return (lastIndex==(max-1));
    }    
    
    void insert(int value){
        keys[++lastIndex] = value; //tang bien dem last index, roi dua value vao
        int childIndex = lastIndex, //bien tam chua index node con
            parentIndex = (childIndex -1)/2; //bien tam chua index node cha
        while (keys[childIndex] > keys[parentIndex]){
            //swap
            int temp = keys[childIndex];
            keys[childIndex] = keys[parentIndex];
            keys[parentIndex] = temp;
            //
            childIndex = parentIndex; //xet child moi la parent ban dau (len 1 level)
            parentIndex = (childIndex-1)/2; //xet parent moi di len 1 level
        }
    }
    
    void preOrder(int i) {
        if (i <= lastIndex) {
            System.out.print(keys[i] + " ");
            preOrder(i * 2 + 1);
            preOrder(i * 2 + 2);
        }
    }
    
    //CONSIDER THE HEAP AS A QUEUE
    void enqueue(int data){
        insert(data);
    }
    
    int dequeue(){
        int temp = keys[0];
        //move last element to the first
        keys[0] = keys[lastIndex--];
        rearrange(0); //call rearrange method
        return temp;
    }
    
    /*  
        rearrange idea
    - parentIndex = 0 (root)
    => left index = 1; right index = 2.
    if: left < last index AND value at left > value at parent 
    then: set new parent index = left index
    if: right < last index AND value at right > value at parent
    then: set new parent index = right index
    
    */
    
    
    void rearrange(int index) {
        int parentIndex = index; //CURRENT NODE
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        if (leftChildIndex < lastIndex && keys[leftChildIndex] > keys[parentIndex]) {
            parentIndex = leftChildIndex;
        }
        if (rightChildIndex < lastIndex && keys[rightChildIndex] > keys[parentIndex]) {
            parentIndex = rightChildIndex;
        }
        if (parentIndex != index) {
            //swap
            int temp = keys[index];
            keys[index] = keys[parentIndex];
            keys[parentIndex] = temp;
            //recursive
            rearrange(parentIndex);
        }
    }
    
}
