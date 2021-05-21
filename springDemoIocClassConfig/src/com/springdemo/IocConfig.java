package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo") //database için com.springdemo'daki tüm sýnýflarý arayacak
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MySqlCustomerDal();
	}
	
	
	
}
