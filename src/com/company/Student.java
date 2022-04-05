package com.company;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String group;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student(int id, String name, String surname, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public void addBorrowedBooks(Book book) {
        borrowedBooks.add(book);
    }
    public void removeBorrowedBooks(int id) {
        borrowedBooks.remove(id);
    }

    public String toStringBorrowedBooks() {
        String s = "";
        for (Book book : borrowedBooks) {
            if (book != null) {
                s += borrowedBooks.indexOf(book) + ": " + book.toString();
            }
            if (borrowedBooks.size() > 1)
                s += ", \n";
        }
        if (s.equals(""))
            s = "empty";
        return s;
    }

    @Override
    public String toString() {
        return "Student: " +
                "\nid = " + id +
                "\nname = " + name +
                "\nsurname = " + surname +
                "\ngroup = " + group;
    }
}
