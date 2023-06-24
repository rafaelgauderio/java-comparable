package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entidades.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> productList = new ArrayList<Product> ();
		Product p1 = new Product("Chair", 150.90);
		Product p2 = new Product("Table", 850.50);
		Product p3 = new Product("Box bed", 1250.90);
		Product p4 = new Product("Cabinet", 320.20);
		Product p5 = new Product("Armchair", 1200.60);
		Product p6 = new Product("Marble sink", 1600.00);
		Product p7 = new Product("Wooden sink", 1300.20);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		
		// order by price descending
		Collections.sort(productList); 
		
		for(Product nickname : productList) {
			System.out.println(nickname);
		}
		
		// order by price descending
		productList.sort(Comparator.comparing(Product::getName).reversed());
		System.out.println("\nforEach as lambda expression. Comparator by name descending (reversed) ");
		productList.forEach((product) -> System.out.println(product));
		
		ComparatorByPrice comparator = new ComparatorByPrice();
		productList.sort(comparator);
		System.out.println("\nforEach as lambda expression. Comparator by price ascending");
		productList.forEach((product) -> System.out.println(product));		

	}

}
