package com.brillio.aggregateservice.aggregateservice.model;

public class Review {

    private String id;
    private String rating;
    private String description;
    private String bookId;

    public Review(String id, String rating, String description,String bookId) {
        this.id = id;
        this.rating = rating;
        this.description = description;
        this.bookId = bookId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id='" + id + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                ", bookId='" + bookId + '\'' +
                '}';
    }
}
