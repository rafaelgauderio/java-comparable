package application;

import java.util.Comparator;

import entidades.Product;

public class ComparatorByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getPrice().compareTo(p2.getPrice());
	}

}
