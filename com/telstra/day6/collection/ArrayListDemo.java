package com.telstra.day6.collection;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		System.out.println("size of arraylist before adding "+obj.size());
		obj.add(1);
		obj.add("hello");
		obj.add(12.34);
		obj.add("hi");
		obj.add("hi");
		System.out.println("size of arraylist after adding "+obj.size());
		System.out.println("elements of the array: "+obj);
		obj.set(2,"java");
		System.out.println("elements of the array after adding: "+obj);
		obj.remove(Integer.valueOf(1));
		System.out.println("elements of the array after remove: "+obj);
		System.out.println("element contains: "+obj.contains("hello"));
		obj.clear();
		System.out.println("elements of the array after clear: "+obj);

	}

}
