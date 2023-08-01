package com.telstra.day6.exception;

class InValidAgeException extends Exception
{
	String msg;

	public InValidAgeException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMsg()
	{
		return msg;
	}
}
class Customer
{
	public void checkEligibility(int age) throws InValidAgeException
	{
		if(age>=18)
			System.out.println("you are eligible to vote");
		else
			throw new InValidAgeException("age is less, minimum should be 18");
	}
}


public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer =new Customer();
		try
		{
			customer.checkEligibility(13);
		}
		catch(InValidAgeException e)
		{
			System.out.println(e.getMsg());
		}

	}
}



