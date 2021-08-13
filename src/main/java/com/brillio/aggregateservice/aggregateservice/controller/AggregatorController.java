package com.brillio.aggregateservice.aggregateservice.controller;

import com.brillio.aggregateservice.aggregateservice.model.BookDetail;
import com.brillio.aggregateservice.aggregateservice.model.Review;
import com.brillio.aggregateservice.aggregateservice.proxy.BookDetailProxy;
import com.brillio.aggregateservice.aggregateservice.proxy.ReviewProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AggregatorController {
    @Autowired
    private BookDetailProxy bookDetailProxy;

    @Autowired
    private ReviewProxy reviewProxy;

    //Calling BookDetail service using feign
    @GetMapping("/books")
    public List<BookDetail> getBooks(){
        return bookDetailProxy.getAllBooks();
    }

    //Calling Review service using feign
	//heloo continew
    @GetMapping("/reviews/{id}")
    public List<Review> getReviews(@PathVariable String id){
        return reviewProxy.getReview(id);
    }


    //method implemented in BookDetail service
    /*@GetMapping("/api/books")
    public List<BookDetail> getBook(){
        return getAllBooks();
    }

    //method implemented in Review service
    @GetMapping("/api/review/{id}")
    public List<Review> getReview(@PathVariable String id){
        return getAllReviews(id);
    }*/

    //Hard coded model for books and reviews
    /*public List<BookDetails> getAllBooks(){
        return Arrays.asList(new BookDetails("b101","A Better India: A Better World","Narayana Murthy","some description"),
                new BookDetails("b102","A Passage to India","E.M. Foster","some description"),
                new BookDetails("b103","A Revenue Stamp","Amrita Pritam","some descriptions"),
                new BookDetails("b104","Death of a City","Amrita Pritam","some description"));
    }
*/
    /*public List<Review> getAllReviews(String bookId){
        List<Review> reviews = Arrays.asList(new Review("r101", "4", "Very Good", "b102"),
                new Review("r102", "3", "Good", "b103"),
                new Review("r103", "5", "Excellent", "b103"),
                new Review("r104", "2", "Average", "b104"),
                new Review("r105", "5", "Ecellent", "b102"),
                new Review("r016", "4", "Very Good", "b102"),
                new Review("r107", "3", "Good", "b102"),
                new Review("r108", "5", "Excellent", "b104"),
                new Review("r109", "3", "Good", "b101"),
                new Review("r110", "4", "Very Good", "b101"));

        List<Review> bookReviews = reviews.stream().filter(review -> review.getBookId().equals(bookId))
                .collect(Collectors.toList());
        return bookReviews;
    }*/
}
