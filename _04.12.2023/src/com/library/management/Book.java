package com.library.management;

public record Book(String title, String author, int yearPublished) {
    public Book(){
        this("Nieznany", "Nieznany", 18);
    }
}
