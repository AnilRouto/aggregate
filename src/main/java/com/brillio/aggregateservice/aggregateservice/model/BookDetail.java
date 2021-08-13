package com.brillio.aggregateservice.aggregateservice.model;


public class BookDetail {

    private String bookId;
    private String name;
    private String author;
    private String genre;

    public BookDetail(String bookId, String name, String author, String genre) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

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



    @Override
    public String toString() {
        return "BookDetail{" +
                "id='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + genre + '\'' +
                '}';
    }
}
