package com.abstraction;

public abstract  class Bank  {
	
	public Bank() {
	System.out.println("bank constructor");
	}

	public abstract void bankUser();
	public abstract void accountType();
	
	public final void name() {
		System.out.println("name method");
	}
}
