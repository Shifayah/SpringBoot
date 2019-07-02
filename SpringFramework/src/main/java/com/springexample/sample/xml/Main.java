package com.springexample.sample.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// this shows dependency injection using xml
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj=(Vehicle) context.getBean("vehicle");
		obj.drive();
		Tyre tyre=(Tyre) context.getBean("tyre");
		tyre.getBrand();
		
		System.out.println(tyre);
		
	}
}
