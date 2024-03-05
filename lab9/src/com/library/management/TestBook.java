package com.library.management;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Mistborn", "Brandon Sanderson", 2012);
        Book book2 = new Book();

        System.out.println(book1.author());
        System.out.println(book2.yearPublished());
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode()==book2.hashCode());
    }
}
