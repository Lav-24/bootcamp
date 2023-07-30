package com.telstra.service;
import com.telstra.dao.*;

public class PaymentConfirmation {
	Payment payment;
	public PaymentConfirmation()
	{
	payment=new Cash();
	}
	public void confirmation()
	{
		payment.doPayment();
		System.out.println("ticket payment logic");
	}
	
	
}
