package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context 
		= new AnnotationConfigApplicationContext(IocConfig.class);
	//Ýlgili config dosyasýna gidecek

	
	ICustomerDal iCustomerDal = context.getBean("database",ICustomerDal.class);
	
	iCustomerDal.add();
	
	
	}

}

