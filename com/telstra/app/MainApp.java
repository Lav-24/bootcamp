package com.telstra.app;
import com.telstra.service.BookingService;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingService bookingService= new BookingService();
		bookingService.bookTicket();

	}

}
