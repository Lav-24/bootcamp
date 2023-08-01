package com.telstra.day6.collection;
import java.util.ArrayList;
public class GenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(2,"laptop",78000,"electronics");
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(1,"laptop",68000,"electronics"));

	}

}
