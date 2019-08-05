package com.oogie;

public class Book extends MediaType{
    private String publisher;
    private int pageCount;

    public Book() {
    }

    public Book(String title, int year) {
        super(title, year);
    }

    public Book(String title, int year, String publisher, int pageCount) {
        super(title, year);
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
