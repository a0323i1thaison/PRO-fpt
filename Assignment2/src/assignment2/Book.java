
package assignment2;


public class Book {
    String ISBN;
    String title;
    String author;
    int year;
    String publisher;
    String imageUrlS, imageUrlM, imageUrlL;

    public Book(String ISBN, String title, String author, int year, String publisher, 
                String imageUrlS, String imageUrlM, String imageUrlL) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.imageUrlS = imageUrlS;
        this.imageUrlM = imageUrlM;
        this.imageUrlL = imageUrlL;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + title + ", Author: " + author + 
               ", Year: " + year + ", Publisher: " + publisher;
    }

}
