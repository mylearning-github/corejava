package com.mainmethod;

import com.abstraction.Interface2;
import com.constructor.Child;
import com.iheritance.ChildInheritance;

public class MainMethod {

	static int  s;
	public static void main(String[] args) {
		
		Interface2 i = (f,g) -> {
			System.out.println("Addition of two numbers is: " + s );
			return s=  (f+g);
		};
		i.implrmentation(220,100);
	}

}
