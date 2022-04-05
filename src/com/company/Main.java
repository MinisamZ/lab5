package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Library.toStringBooks();
        Library.addBook(new Book("Cler", "John", "1", 2000, 1));
        Library.addStudents(new Student(Library.getSizeArrayStudents(),"Ala","Z","it1"));
        Library.toStringBooks();
        Scanner scan = new Scanner(System.in);
        int selectIdStudent;
        int selectIdBook;
        int id;

        while (true) {
            System.out.println("=====================");
            System.out.println("1: Добавить книгу" +
                    "\n2: Добавить студента" +
                    "\n3: Добавить книгу студенту" +
                    "\n4: Удалить книгу у студента" +
                    "\n5: Инфо о списках студентов и книгах" +
                    "\n6: Книги у студента" +
                    "\n7: Завершить программу");
            String s = scan.nextLine();
            switch (s) {
                case "1":
                    System.out.println("Введите название книги:");
                    String title = scan.nextLine();
                    System.out.println("Введите автора книги:");
                    String author = scan.nextLine();
                    System.out.println("Введите isbn книги:");
                    String isbn = scan.nextLine();
                    System.out.println("Введите год книги:");
                    int year = scan.nextInt();
                    System.out.println("Введите колво книг:");
                    int quantity = scan.nextInt();
                    Library.addBook(new Book(title, author, isbn, year, quantity));
                    Library.getLastBook();
                    break;
                case "2":
                    id = Library.getSizeArrayStudents();
                    System.out.println("Введите имя студента:");
                    String name = scan.nextLine();
                    System.out.println("Введите фамилию:");
                    String surname = scan.nextLine();
                    System.out.println("Введите группу:");
                    String group = scan.nextLine();
                    Library.addStudents(new Student(id, name, surname, group));
                    Library.getLastStudent();
                    break;
                case "3":
                    System.out.println("Список студентов:");
                    Library.toStringStudents();
                    System.out.println("Введите id студента у которого хотите добавить книгу:");
                     selectIdStudent = scan.nextInt();
                    System.out.println(Library.getStudentById(selectIdStudent));

                    System.out.println("Список книг:");
                    Library.toStringBooks();
                    System.out.println("Введите id книги которую хотите добавить:");
                    selectIdBook = scan.nextInt();
                    System.out.println(Library.getBookById(selectIdBook));

                    Library.getStudentById(selectIdStudent).addBorrowedBooks(Library.getBookById(selectIdBook));
                    System.out.println(Library.getStudentById(selectIdStudent));
                    break;
                case "4":
                    System.out.println("Список студентов:");
                    Library.toStringStudents();
                    System.out.println("Введите id студента у которого хотите удалить книгу:");
                    selectIdStudent = scan.nextInt();
                    System.out.println(Library.getStudentById(selectIdStudent).toStringBorrowedBooks());
                    if (Library.getStudentById(selectIdStudent).toStringBorrowedBooks().isEmpty())
                        break;
                    System.out.println("Введите id книги которую хотите удалить у студента:");
                    selectIdBook = scan.nextInt();
                    Library.getStudentById(selectIdStudent).removeBorrowedBooks(selectIdBook);
                    System.out.println(Library.getStudentById(selectIdStudent));
                    break;
                case "5":
                    System.out.println("Список книг:");
                    Library.toStringBooks();
                    System.out.println("Список студентов:");
                    Library.toStringStudents();
                    break;
                case "6":
                    System.out.println("Список студентов:");
                    Library.toStringStudents();
                    System.out.println("Введите id студента у которого хотите посмотреть книги:");
                    selectIdStudent = scan.nextInt();
                    System.out.println(Library.getStudentById(selectIdStudent).toStringBorrowedBooks());
                    break;
                case "7":
                    System.out.println("exit");
                    return;
                default:
                    System.out.println("non format");
            }
            scan.nextLine();
        }
    }
}
