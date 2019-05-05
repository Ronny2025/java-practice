package day34_methods06_varargs;

public class MethodOverloading {
public static void main(String[] args) {
	add(10,20);
	add("one","two");
}
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result:" + result);
		
	}
	
	public static void add(double num1, double num2) {
		double result= num1 +num2;
		System.out.println("Result:"+ result);
	}
	public static void add(String num1, String num2) {
		String result= num1 +num2;
		System.out.println("Result:"+ result);
}
}
