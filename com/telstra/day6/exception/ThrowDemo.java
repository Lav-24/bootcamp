package com.telstra.day6.exception;

import java.io.IOException;

class User
{
	public void checkEligibility(int age)
	{
		if(age>=18)
			System.out.println("you are eligible to vote");
		else
			throw new ArithmeticException("you are not eligible to vote");
	}
	public void checkEligibility2(int age) throws IOException
	{
		if(age>=18)
			System.out.println("you are eligible to vote");
		else
			throw new IOException("you are not eligible to vote");
	}
}
public class ThrowDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		User user=new User();
		try
		{
		user.checkEligibility(19);
		user.checkEligibility2(13);
		}
		catch (Exception e)
		{
			System.out.println("something went wrong");
		}
	}

}
