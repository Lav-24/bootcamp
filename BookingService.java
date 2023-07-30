package com.telstra.service;
import com.telstra.dao.DbConnect;
import com.telstra.dao.*;

public class BookingService {
	DbConnect dbConnect;
	public BookingService()
	{
		dbConnect = new Oracle();
	}
	public void bookTicket()
	{
		dbConnect.databaseProperty();
		System.out.println("ticket booking logic");
	}

}
