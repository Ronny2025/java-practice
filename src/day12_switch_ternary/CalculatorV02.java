package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter first number
		//5
		//Enter second number
		//6
		//Select Operation: +,-,*,/,%
		//*
		//Result: 30.0


	//double num1, num2, result
	//String operator
	//Scanner input
		
		//Get number
        System.out.println("Enter first number:");
		double num1 = input.nextDouble();
		System.out.println("Enter second Number");
		double num2 = input.nextDouble();
		System.out.println("Select Operator: +, -, *, /, %");
		String operator =input.next();
		double result = 0.0;
		//perform calculation and perform
	    switch (operator) {
	    
	    
	    case ("+"):
	    	System.out.println("result =" + num1 + num2);
	    case("-"):
			result = num1 - num2;
	    case("*"):
			result = num1 * num2;
	    case("/"):
			result = num1 / num2;
	    case("%"):
			result = num1 % num2;
		
			System.out.println("Invalid operator selected: " + operator );
			return; //Do not execute the remaining code. STOP HERE
			}
				
		System.out.println("Result:" + result);
		}
	 }


