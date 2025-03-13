package assignment2;

public class AVLTree {

    AVLNode root;

    private int height(AVLNode node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(AVLNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(Book book) {
        root = insertRec(root, book);
    }

    private AVLNode insertRec(AVLNode node, Book book) {
        if (node == null) {
            return new AVLNode(book);
        }

        if (book.ISBN.compareTo(node.book.ISBN) < 0) {
            node.left = insertRec(node.left, book);
        } else if (book.ISBN.compareTo(node.book.ISBN) > 0) {
            node.right = insertRec(node.right, book);
        } else {
            return node; // ISBN đã tồn tại
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Cân bằng AVL
        if (balance > 1 && book.ISBN.compareTo(node.left.book.ISBN) < 0) {
            return rotateRight(node);
        }

        if (balance < -1 && book.ISBN.compareTo(node.right.book.ISBN) > 0) {
            return rotateLeft(node);
        }

        if (balance > 1 && book.ISBN.compareTo(node.left.book.ISBN) > 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && book.ISBN.compareTo(node.right.book.ISBN) < 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public Book search(String ISBN) {
        return searchRec(root, ISBN);
    }

    private Book searchRec(AVLNode node, String ISBN) {
        if (node == null) return null;
        if (node.book.ISBN.equals(ISBN)) return node.book;

        if (ISBN.compareTo(node.book.ISBN) < 0)
            return searchRec(node.left, ISBN);
        else
            return searchRec(node.right, ISBN);
    }

    public void deleteMin() {
        root = deleteMinRec(root);
    }

    private AVLNode deleteMinRec(AVLNode node) {
        if (node == null) return null;
        if (node.left == null) return node.right;
        node.left = deleteMinRec(node.left);
        return node;
    }

    public void inOrder(AVLNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.book);
            inOrder(node.right);
        }
    }
}
