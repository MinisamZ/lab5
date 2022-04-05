package com.company;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
    private int quantity;

    public Book(String title, String author, String isbn, int year, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book title = " + title +
                ", author = " + author +
                ", isbn = " + isbn +
                ", year = " + year +
                ", quantity = " + quantity;
    }
}
