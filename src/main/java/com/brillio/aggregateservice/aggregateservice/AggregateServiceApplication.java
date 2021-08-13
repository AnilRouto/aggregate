package com.brillio.aggregateservice.aggregateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableFeignClients
public class AggregateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregateServiceApplication.class, args);
	}

}
