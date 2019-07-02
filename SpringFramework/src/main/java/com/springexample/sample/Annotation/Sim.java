package com.springexample.sample.Annotation;

import org.springframework.stereotype.Component;

@Component
public class Sim {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Sim [type=" + type + "]";
	}
	
	
}
