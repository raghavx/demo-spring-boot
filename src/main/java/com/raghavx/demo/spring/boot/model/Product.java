package com.raghavx.demo.spring.boot.model;

public class Product {

	private int id;
	private String name, description;

	public Product(int id, String anme, String description) {
		super();
		this.id = id;
		this.name = anme;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
