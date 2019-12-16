package com.raghavx.demo.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghavx.demo.spring.boot.model.Product;
import com.raghavx.demo.spring.boot.service.ProductService;

@RestController
public class ProductController {
	// Product service dependency injection 
	@Autowired
	private ProductService productService;
	
	@GetMapping("/api/products")
	public List<Product> listOfProducts(){
		return productService.listOfProducts();
	}
}
