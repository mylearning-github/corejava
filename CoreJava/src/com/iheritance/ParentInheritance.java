package com.iheritance;

public class ParentInheritance {

	private String name = "jagadeesh";
	void parentInhMethod() {
		System.out.println("parent inher method");
	}
	public String getName() {
		System.out.println("private method name: "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void test() {
		System.out.println("parent test");
	}
}
