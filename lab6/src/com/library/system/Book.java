package com.library.system;

public class Book {
    private int  yearPublished;

    public Book(int yearPublished) {
        this.yearPublished = (yearPublished>= 1455 && yearPublished <= 2023)? yearPublished : 2023;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = (yearPublished>= 1455 && yearPublished <= 2023)? yearPublished : this.yearPublished;
    }
}
