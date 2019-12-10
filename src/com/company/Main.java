package com.company;

import com.company.books.Book;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Napoleon Bonaparte", "Albert Zaharovich Manfred", 797, "Biography", 1972);
        Book book2 = new Book("Conversations with goethe", "Johann Peter Eckermann", 671, "Biography", 1836);
        Book book3 = new Book("De Oratore", " Cicero", 354, "Dialogue", 55);
        Book book4 = new Book("Mkhitar Sparapet", "Sero Khanzadyan", 844, "Story", 1961);
        Book book5 = new Book();

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Book> library = new HashMap<>();
        library.put(book1.getName(), book1);
        library.put(book2.getName(), book2);
        library.put(book3.getName(), book3);
        library.put(book4.getName(), book4);

        int menuNumber;

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("|||||PRESS 1 TO ADD BOOK |||||");
            System.out.println("|||||PRESS 2 TO VIEW BOOK|||||");
            System.out.println("|||||PRESS 3 FOR EXIT    |||||");
            System.out.println("------------------------------");
            menuNumber = scanner.nextInt();
            String text = scanner.nextLine();
            if (menuNumber == 1) {
                System.out.println("Add book name");
                String name = scanner.nextLine();
                book5.setName(name);
                System.out.println("Add book author name");
                String authorName = scanner.nextLine();
                book5.setAuthor(authorName);
                System.out.println("Add book number of pages");
                int numberOfPages = scanner.nextInt();
                book5.setNumberOfPages(numberOfPages);
                String text1 = scanner.nextLine();
                System.out.println("Add book genre");
                String genre = scanner.nextLine();
                book5.setGenre(genre);
                System.out.println("Add book print year");
                int year = scanner.nextInt();
                book5.setYear(year);
                library.put(book5.getName(), book5);
            } else if (menuNumber == 2) {
                System.out.println("Write book name");
                String bookName = scanner.nextLine();
                if (library.containsKey(bookName)) {
                    library.get(bookName).printBookData();
                } else {
                    System.out.println("We have no this book in our library");
                }
            } else if (menuNumber == 3) {
                System.out.println("Thank you for your visit in our library");
            } else {
                System.out.println("Error,if you can return menu reload the page");
                break;
            }
        } while (menuNumber != 3);
    }
}
