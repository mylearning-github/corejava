package com.mainmethod;

import java.util.function.Predicate;

import com.abstraction.Interface2;
import com.constructor.Child;
import com.iheritance.ChildInheritance;

public class MainMethod {

	
	public static void main(String[] args) {
		
		Predicate<Integer> i = ii -> ii % 2 ==0;
		System.out.println("Number is even or Odd: "+i.test(631212));
	}

}
