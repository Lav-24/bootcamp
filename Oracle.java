package com.telstra.dao;

public class Oracle implements DbConnect {

	@Override
	public void databaseProperty() {
		System.out.println("connecting to oracle database");

	}

}
