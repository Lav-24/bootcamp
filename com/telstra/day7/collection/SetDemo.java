package com.telstra.day7.collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetDemo {

	public static void main(String[] args) {
	//String name1="john";
	//String name2="manish";
	//String name3="john";
	//System.out.println(name1.hashCode());
	//System.out.println(name2.hashCode());
	//System.out.println(name3.hashCode());
	HashSet<String> fruits=new HashSet<>();
	fruits.add("apple");
	fruits.add("mango");
	fruits.add("banana");
	fruits.add("kivi");
	System.out.println("fruits: "+fruits);
	LinkedHashSet<String> fruits2=new LinkedHashSet<>();
	fruits2.add("apple");
	fruits2.add("mango");
	fruits2.add("banana");
	fruits2.add("kivi");
	fruits2.add("mango");
	fruits2.add("pineapple");
	System.out.println("fruits2: "+fruits2);
	TreeSet<String> fruits3=new TreeSet<>();
	fruits3.add("mango");
	fruits3.add("banana");
	fruits3.add("kivi");
	fruits3.add("apple");
	fruits3.add("mango");
	fruits3.add("pineapple");
	System.out.println("fruits3: "+fruits3);
	
	}

}
