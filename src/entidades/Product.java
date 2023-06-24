package entidades;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {
	
	private String name;
	private Double price;
	
	public Product () {
		
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name= " + name + ", price= " + String.format("%.2f", price)+ "]";
	}

	@Override
	public int compareTo(Product product) {
		return -price.compareTo(product.getPrice());
		
	}

	@Override
	public int compare(Product p1, Product p2) {		
		return p1.getName().compareTo(p2.getName());
	}
	
	
	
	

}
