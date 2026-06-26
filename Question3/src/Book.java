import java.util.ArrayList;

public class Book {
    //Write a Java program to create a class called "Book" with attributes for title, author,
//    and ISBN, and methods to add and remove books from a collection.
    private String title;
    private String author;
    protected int ISBN;
    protected int id;

    public Book(String t,String athr, int I,int id) {
        this.title  = t;
        this.author = athr;
        this.ISBN = I;
        this.id=  id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }


    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }


}
