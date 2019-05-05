package day11_logical_nestedif;

public class TruthTables {
	public static void main(String[] args) {
System.out.println("##### truth table for && operator #####");
	System.out.println("When true && true - result is  + (true && true)");//true
	System.out.println("When true && false - result is  + (true && false)");//false
	System.out.println("When false && true - result is  + (false && true)");//false
	System.out.println("When false && false - result is  + (false && false)");//false
	
	
	System.out.println();//add empty line
	
	
	System.out.println("##### truth table for || operator #####");
	
	
	System.out.println("When true || true - result is  + (true &&true)");//true
	System.out.println("When true || false - result is  + (true && false)");//true
	System.out.println("When false || true - result is  + (false &&true)");//true
	System.out.println("When false || false - result is  + (false && false)");//false

	System.out.println();//add empty line
	
	
	System.out.println("THRUE TABLE FOR !(NOT) OPERATOR");
	
	System.out.println(" !true - result is " + (!true));
	System.out.println(" !false - result is " + (!false));
	
	System.out.println();//add empty line
	
	
	
	
	
	}
}