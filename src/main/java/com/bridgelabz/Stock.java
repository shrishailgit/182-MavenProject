package com.bridgelabz;

public class Stock {

	String name ;
	int price;
	public Stock(String name, int price) {
	
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
