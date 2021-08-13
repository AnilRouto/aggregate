package com.brillio.aggregateservice.aggregateservice.proxy;

import com.brillio.aggregateservice.aggregateservice.model.BookDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(contextId = "book",name = "bookdetail")
public interface BookDetailProxy {
    @GetMapping("/api/books")
    public List<BookDetail> getAllBooks();
}
