package com.brillio.aggregateservice.aggregateservice.proxy;

import com.brillio.aggregateservice.aggregateservice.model.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(contextId = "review",name = "book-review")
public interface ReviewProxy {
    @GetMapping("/api/review/{id}")
    public List<Review> getReview(@PathVariable String id);
}
