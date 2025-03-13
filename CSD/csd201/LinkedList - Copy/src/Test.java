
public class Test {
    public static void main(String[] args){
        System.out.println("xin chao the gioi");
        
        List list = new List();
        
        list.addAtEnd(30);
        list.addAtEnd(7);
        list.addAtEnd(30);
        list.addAtEnd(30);
        list.addAtEnd(17);
        list.addAtEnd(30);
        list.addAtEnd(30);
        list.addAtEnd(30);
        
        
        list.traverse();
//        System.out.println("After added at beginning:");
//        list.addAtBegin(400);
//        list.traverse();
//        
//System.out.println("After added at INDEX 2:");
//
//        list.insertByIndex(15, 2);
//        list.traverse();
//        
//System.out.println("After DELETING HEAD:");
//        list.deleteHead();
//        list.traverse();
//System.out.println("After DELETING TAIL:");
//        list.deleteTail();
//        list.traverse();
// System.out.println("After DELETING by index:");
//        list.deleteByIndex(2);
//        list.traverse();     
System.out.println("After remove data 30");
        list.deleteData(30);
        list.traverse();
    }
}