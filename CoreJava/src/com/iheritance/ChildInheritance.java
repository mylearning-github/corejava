package com.iheritance;

public class ChildInheritance extends ParentInheritance {

	
	 public void childmethod() {
		System.out.println("child method");
	}
	 
	 public void test() {
		System.out.println("child test");
		super.test();
	}
	 
}
