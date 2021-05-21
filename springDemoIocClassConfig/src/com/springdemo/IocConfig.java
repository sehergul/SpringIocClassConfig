package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo") //database i�in com.springdemo'daki t�m s�n�flar� arayacak
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MySqlCustomerDal();
	}
	
	
	
}
