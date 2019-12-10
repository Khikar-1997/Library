package com.company.books;

public class Book implements PrintBookData {
    private String name;
    private String author;
    private int numberOfPages;
    private String genre;
    private int year;

    public Book(String name, String author, int numberOfPages, String genre, int year) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.year = year;
    }

    public Book() {
    }

    @Override
    public void printBookData() {
        System.out.println("Name = " + this.getName() + "\n" + "Author = " + this.getAuthor() + "\n" + "Number of pages = " + this.getNumberOfPages() + "\n" + "Genre = " + this.getGenre() + "\n" + "Year = " + this.getYear());
    }

    //region Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //endregion
}
