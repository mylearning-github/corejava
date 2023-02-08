package com.abstraction;

public class Customer extends Bank {

	@Override
	public void bankUser() {
		System.out.println("A bank new user");
		
	}

	@Override
	public void accountType() {
		System.out.println("This is savings accounts");
		
	}

	

}
