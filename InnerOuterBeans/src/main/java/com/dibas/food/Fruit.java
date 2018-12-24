package com.dibas.food;

public class Fruit {

	private String description = "not set";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Fruit() {
		// no arg constructor
	}

	public String talkAboutYou() {
		return description;
	}
	
	
	public void initMethod() {
		System.out.println("The fruit bean is ready to go. "+description);
	}
	
	public void destroyMethod() {
		System.out.println("The fruit bean is about to be destroyed.");
	}

}
