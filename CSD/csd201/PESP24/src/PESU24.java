public class PESU24 {
    static class Task implements Comparable<Task> {
        private int id;
        private String description;
        private int priority;
        public Task(int id, String description, int priority) {
            this.id = id;
            this.description = description;
            this.priority = priority;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public int getPriority() {
            return priority;
        }
        public void setPriority(int priority) {
            this.priority = priority;
        }
        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);
        }
        @Override
        public String toString() {
            return "Task{" + "id=" + id + ", description=" + description + ", priority=" + priority + '}';
        }
    }
    public static void main(String args[]) {
        Task[] tasks = {new Task(1, "", 100), new Task(2, "", 80), new Task(3, "", 40), new Task(4, "", 90)};
        for (Task t : tasks) {
            System.out.println(t);
        }
        class MergeSortHelper {
            public void merge(Task a[], int first, int last) {
                int mid = (first + last) / 2;
                int size1 = mid - first + 1;
                int size2 = last - mid;
                Task[] a1 = new Task[size1];
                Task[] a2 = new Task[size2];
                for (int i = 0; i < size1; i++) {
                    a1[i] = a[first + i];
                }
                for (int i = 0; i < size1; i++) {
                    a2[i] = a[mid + 1 + i];
                }
                int i = 0, j = 0, k = first;
                while (i < size1 && j < size2) {
                    if (a1[i].compareTo(a2[j]) >= 0) {
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
            public void mergeSort(Task[] a) {
                mergeSort(a, 0, a.length - 1);
            }
            private void mergeSort(Task[] a, int first, int last) {
                if (first < last) {
                    int mid = (first + last) / 2;
                    mergeSort(a, first, mid);
                    mergeSort(a, mid + 1, last);
                    merge(a, first, last);
                }
            }
        }
        MergeSortHelper msh = new MergeSortHelper();
        msh.mergeSort(tasks);
        System.out.println("\nAfter merge sort:");
        for (Task t : tasks) {
            System.out.println(t);
        }
        MaxHeap heap = new MaxHeap(tasks);
        heap.insert(new Task(12,"",75));
        heap.remove();
    }
    public static class MaxHeap {
        //using array to implement
        // muốn chuyển về minheap thì thay đổi điều kiện so sánh từ > thành < khi so sánh hai key
        // ở các hàm insert, rearrrange
        Task[] keys;
        int max; //heap size
        int lastIndex;
        public MaxHeap(int max1) {
            max = max1;
            keys = new Task[max];
            lastIndex = -1;
        }
        public MaxHeap(Task[] tasks) {
            this.keys = tasks;
            this.max = tasks.length;
            this.lastIndex = tasks.length - 1;
            // Xây dựng heap từ dưới lên để tuân thủ tính chất của MaxHeap
            for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
                rearrange(i);
            }
        }
        public MaxHeap() {
            this(20);
        }
        public boolean isEmpty() {
            return (lastIndex == -1);
        }
        public boolean isFull() {
            return (lastIndex == (max - 1));
        }
        void insert(Task value) {
            keys[++lastIndex] = value; //tang bien dem last index, roi dua value vao
            int childIndex = lastIndex, //bien tam chua index node con
                    parentIndex = (childIndex - 1) / 2; //bien tam chua index node cha
            while (keys[childIndex].getPriority() > keys[parentIndex].getPriority()) {
                //swap
                Task temp = keys[childIndex];
                keys[childIndex] = keys[parentIndex];
                keys[parentIndex] = temp;
                //
                childIndex = parentIndex; //xet child moi la parent ban dau (len 1 level)
                parentIndex = (childIndex - 1) / 2; //xet parent moi di len 1 level
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
        void enqueue(Task data) {
            insert(data);
        }
        Task remove() {
            Task temp = keys[0];
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
        final void rearrange(int index) {
            int parentIndex = index; //CURRENT NODE
            int leftChildIndex = 2 * parentIndex + 1;
            int rightChildIndex = 2 * parentIndex + 2;
            if (leftChildIndex < lastIndex && keys[leftChildIndex].getPriority() > keys[parentIndex].getPriority()) {
                parentIndex = leftChildIndex;
            }
            if (rightChildIndex < lastIndex && keys[rightChildIndex].getPriority() > keys[parentIndex].getPriority()) {
                parentIndex = rightChildIndex;
            }
            if (parentIndex != index) {
                //swap
                Task temp = keys[index];
                keys[index] = keys[parentIndex];
                keys[parentIndex] = temp;
                //recursive
                rearrange(parentIndex);
            }
        }
    }
}
