package ru.Netology.domain;

public class Book extends Product {
    private String BookName;
    private String author;

    public Book() {
        super();
    }

    public Book(int id, String name, int price, String BookName, String author) {
        super(id, name, price);
        this.BookName = BookName;
        this.author = author;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
