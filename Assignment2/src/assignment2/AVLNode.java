package assignment2;

public class AVLNode {

    Book book;
    int height;
    AVLNode left, right;

    public AVLNode(Book book) {
        this.book = book;
        this.height = 1;
    }

}
