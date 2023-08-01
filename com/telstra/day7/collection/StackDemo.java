package com.telstra.day7.collection;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> nums=new Stack<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println("elements: "+nums);
		nums.pop();
		System.out.println("elements: "+nums);
		nums.pop();
		System.out.println("elements: "+nums);

	}

}
