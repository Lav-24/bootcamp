package com.telstra.day7.collection;
import java.util.ArrayList;
import java.util.Collections;
public class batchProb {

	public static void main(String[] args) {
		ArrayList<String> batch1=new ArrayList<String>();
		batch1.add("rohit");
		batch1.add("john");
		batch1.add("ankit");
		batch1.add("sourab");
		batch1.add("rahul");
		System.out.println("batch1:"+batch1);
		ArrayList<String> batch2=new ArrayList<String>();
		batch2.add("anil");
		batch2.add("manas"); 
		batch2.add("rohit");
		batch2.add("rahul");
		batch2.add("karan");
		System.out.println("batch2:"+batch2);
		batch2.removeAll(batch1);
		System.out.println("after removing batch2:"+batch2);
		batch2.addAll(batch1);
		System.out.println("after adding batch2:"+batch2);
		Collections.sort(batch2);
		System.out.println("after sorting, batch2:"+batch2);
	}

}
