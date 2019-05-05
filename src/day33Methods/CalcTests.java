package day33Methods;

public class CalcTests {                                    
	public static void main(String[] args) {   //calling code from calculator exercise
		System.out.println(calculator.add(3, 1));
		System.out.println(calculator.multiply(5, 6));
		System.out.println(calculator.minus(40, 12));
		System.out.println(calculator.divide(100, 2));
		int addResult = calculator.add(21, 41);
		double mResult = calculator.multiply(50, 40);
		double miResult = calculator.minus(3000, 200);
		double dResult = calculator.divide(455, 5);
		System.out.println("addResult: " + addResult);
		System.out.println("mResult: " + mResult);
		System.out.println("miResult: " + miResult);
		System.out.println("dResult: " + dResult);

		double a = 10.0, b = 5.0;
		double myResult = calculator.minus(a, b);
		System.out.println("myResult: " + myResult);
		
		double[] dNums = {2.0, 4.0};
		double result2 = calculator.multiply(dNums[0], dNums[1]);
		System.out.println("result2: " + result2);
		            //26
if (calculator.add(10, 16)==26) {
	System.out.println(("Add Unit Test Passed"));
}else {
	System.out.println("Add unit test failed");
}
	String str = "java";
	if (str.length()==4) {
		System.out.println("It is 4 characters");
	}else {
		System.out.println("It is not 4 characters");
	}
	}
}
