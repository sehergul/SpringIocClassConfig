package com.springdemo;

import org.springframework.stereotype.Component;

public class MySqlCustomerDal implements ICustomerDal{
	String connectionString;

	@Override
	public void add() {
		System.out.println("Connection string: " + this.connectionString);
		System.out.println("MySql veri tabanưna eklendi!");

	}
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
