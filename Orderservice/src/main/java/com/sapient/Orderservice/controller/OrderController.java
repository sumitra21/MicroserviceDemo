package com.sapient.Orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order-api")
public class OrderController {
	
	@GetMapping
	public String order() {
		return "Order Service Created";
	}
	
	@GetMapping("{id}")
	public String order(@PathVariable String id) {
		return "Order id created with id " + id ;
	}

}
