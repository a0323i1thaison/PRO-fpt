
package assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Assignment2 {

   
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        String filePath = "book.csv";

        // Đọc file CSV và đo thời gian chèn
        long startInsert = System.nanoTime();
        readCSV(filePath, tree);
        long endInsert = System.nanoTime();
        System.out.println("thoi gian chen : " + (endInsert - startInsert) / 1_000_000 + " ms");

        // In danh sách sách
        System.out.println("list sach trong AVL:");
        tree.inOrder(tree.root);

        // Tìm kiếm sách và đo thời gian
        String searchISBN = "12345";
        long startSearch = System.nanoTime();
        Book found = tree.search(searchISBN);
        long endSearch = System.nanoTime();

        if (found != null) {
            System.out.println("find book: " + found);
        } else {
            System.out.println("Not find book with ISBN : " + searchISBN);
        }
        System.out.println("find time : " + (endSearch - startSearch) / 1_000_000 + " ms");

        // Xóa sách có ISBN nhỏ nhất
        tree.deleteMin();
        System.out.println("list after remove book  :");
        tree.inOrder(tree.root);
    }

    public static void readCSV(String filePath, AVLTree tree) {
         try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (int i = 1; i < lines.size(); i++) {
                String[] data = lines.get(i).split(",");
                if (data.length < 8) continue; 

                String ISBN = data[0].trim();
                String title = data[1].trim();
                String author = data[2].trim();
                int year = Integer.parseInt(data[3].trim());
                String publisher = data[4].trim();
                String imageUrlS = data[5].trim();
                String imageUrlM = data[6].trim();
                String imageUrlL = data[7].trim();

                Book book = new Book(ISBN, title, author, year, publisher, imageUrlS, imageUrlM, imageUrlL);
                tree.insert(book);
            }
        } catch (IOException e) {
            System.out.println("error read file: " + e.getMessage());
        }
    }
    
}
