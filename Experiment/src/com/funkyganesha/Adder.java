package com.funkyganesha;

import java.util.*;

public class Adder {
	Printer p = new ConsolePrinter();

	public int add(int a, int b) {
		System.out.println(a+b);
		return a + b;
	}
	
	public void printlist(List<Integer> trial){
		
		for(Integer num : trial)
			System.out.println(num);
		
	}

	public double divide(int a, int b) {
		
		if (b != 0) {
			System.out.println(a/b);
			return a / b;			
		}else {
			System.out.println("-9999");
			return -9999;
		}
		

	}

}
