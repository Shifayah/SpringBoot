package com.springexample.sample.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedmiMob implements Mobile {

	@Autowired
	private Sim sim;

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void display() {
		System.out.println("Display of Redmi");
	}

	@Override
	public String toString() {
		return "RedmiMob [sim=" + sim + "]";
	}
}

