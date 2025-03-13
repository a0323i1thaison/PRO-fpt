







public class TestDLList {
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("TEST DOUBLY LINKED LIST");
        list.addLast(16);
        list.addLast(21);
        list.addLast(16);
        list.addLast(19);
        list.addLast(16);
        list.addLast(20);
        list.addFirst(29);             
        list.addLast(22);
        list.traverseForward();
        list.removeData(16);
        System.out.println("AFTER REMOVING ALL 16:");
        list.traverseForward();
        list.sort();
        System.out.println("AFTER SORTING:");
        list.traverseForward();        
        
    }
    
    
}