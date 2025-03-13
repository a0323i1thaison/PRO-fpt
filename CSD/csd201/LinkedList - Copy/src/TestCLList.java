public class TestCLList {
    public static void main(String[] args){
        CLList list = new CLList();
        list.addTail(36);
        list.addTail(49);
        list.addTail(93);
        list.addTail(95);
        list.addTail(39);
        list.traverse();
//        list.rotate();
//        list.traverse();
//        list.rotate();
//        list.traverse();
        list.removeHead();
        list.traverse();
        
    }
}