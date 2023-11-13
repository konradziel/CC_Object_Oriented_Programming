package com.library.system;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book(1920);
        System.out.println(book.getYearPublished());
        book.setYearPublished(1300);
        System.out.println(book.getYearPublished());
        book.setYearPublished(1455);
        System.out.println(book.getYearPublished());


    }
}
