package day05_math_operator;

public class ArimethicOperators {

	public static void main(String[] args) {
		// +- addition operator
		System.out.println(55 +5); 
		int chairs = 140;
		System.out.println(chairs + 2);
		
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		// - Subtraction. Minus
		System.out.println(500-123);
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		
		System.out.println(balance - transaction);
		
		balance = balance - transaction;
		
		System.out.println(balance);
		
		
		int linesOfCode = 50;
		System.out.println("lines Of Code " + linesOfCode);
		
		linesOfCode = linesOfCode - 2;
		System.out.println(linesOfCode - 2);
		
		//multiplication *
		System.out.println(22 * 2);
		
		//declare variables classes and assign 5
		
		int classes =5;
		System.out.println(linesOfCode * classes);
		
		int totalLinesOfCode = linesOfCode * classes;
		//totalLinesOfCode=240
		System.out.println("totalLinesOfCode="+totalLinesOfCode);
		//DIVISION operator/
		System.out.println(10 /3);
		System.out.println(55 / 5);
		System.out.println(10.0 / 3);
		System.out.println(15 / 7);
		System.out.println(15.0 / 7);
		System.out.println(5.0/2.0);
		System.out.println(5/2);
		System.out.println(11/0); 
		//in Java, when you divide by 0 , code will compile.
		//But when code is running, Java will throw/ show error.
		
	
	

		
		
		

 }
}