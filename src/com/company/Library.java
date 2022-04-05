package com.company;

import java.util.ArrayList;

public class Library {
    private static final ArrayList<Book> books = new ArrayList<>();
    private static final ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static Book getBookById(int id) {
        return books.get(id);
    }

    public static Student getStudentById(int id) {
        return students.get(id);
    }

    public static void addBook(Book newBook) {
        books.add(newBook);
    }

    public static void addStudents(Student student) {
        students.add(student);
    }

    public static void getLastBook() {
        System.out.println(books.get(books.size() - 1));
    }

    public static void getLastStudent() {
        System.out.println(students.get(students.size() - 1));
    }

    public static int getSizeArrayBooks() {
        return books.size();
    }

    public static int getSizeArrayStudents() {
        return students.size();
    }

    public static void toStringBooks() {
        for (Book book : books)
            System.out.println(books.indexOf(book) + ": " + book.toString());
        if (books.size() < 1)
            System.out.println("Пустой список");
    }

    public static void toStringStudents() {
        for (Student st : students)
            System.out.println(st.toString());
        if (students.size() < 1)
            System.out.println("Пустой список");
    }
}
