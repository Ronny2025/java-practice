package day13_ternay_strings_intro;

public class Ternary {
	public static void main( String[] args) {
		String result;
		int score = 48;
		if(score> 60) {
			result = "pass";
		}else {
			result = "fail";
		}
		
		//result = score > 60 ? "pass" : "fail"; // making your code light and simpler.
		System.out.println("Result is "+  "fail");
		
	}

}
