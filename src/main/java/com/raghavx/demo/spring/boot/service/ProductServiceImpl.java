package com.raghavx.demo.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.raghavx.demo.spring.boot.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> listOfProducts() {
		List<Product> products = new ArrayList<Product>();
		for (int i = 0; i < 10; i++) {
			int id = (int)(Math.random() * 100);
			products.add(new Product(id, "Name " +  i , "Description " + i));
		}
		return products;
	}

}
