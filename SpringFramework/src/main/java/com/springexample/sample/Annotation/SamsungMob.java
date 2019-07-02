package com.springexample.sample.Annotation;

import org.springframework.stereotype.Component;

@Component

public class SamsungMob implements Mobile {

	public void display() {
		System.out.println("Display of Samsung");
	}
}