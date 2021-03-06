package com.nglabs;

import java.util.List;

interface Operation {
	public double doCriteria(double firstNum, double secondNum);
}

public class ArithOperation {
	public static void main(String[] args) {
		Operation add = (a, b)->(a+b);
		Operation multiply = (a, b)->(a*b);
		Operation subtract = (a, b)->(a-b);
		Operation division = (a, b)->(a/b);
		System.out.println("Result is "+doOperation(12, 5, add));
		System.out.println("Result is "+doOperation(12, 5, subtract));
		System.out.println("Result is "+doOperation(12, 5, multiply));
		System.out.println("Result is "+doOperation(12, 5, division));
		List<String> names = List.of("Arun","Tyson", "Max", "Robert", "Janu", "Chad");
		names.forEach(System.out::println);
	}
	
	public static double doOperation(double firstNum, double secondNum, Operation operator) {
		return operator.doCriteria(firstNum, secondNum);
	}

}
