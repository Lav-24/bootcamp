package com.telstraday5.exception;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		try
		{
		System.out.println(2/0);
		}
		catch(Exception e)
		{
			System.out.println("divide by zero error");
		}
	}

}
