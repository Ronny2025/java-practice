package day09_stringequals_conditionals;

import java.util.Scanner;

public class Canada {
	public static void main(String[] args) {
				
		Scanner keyboard = new Scanner(System.in);

//ask user "What is the capital of canada?"
//using scanner assign the value to capital variable.
	
	//Ottawa
	
//Check if the answer is correct.
// => your answer is correct!
// false
 //=>your answer is incorrect!value is not capital of Canada.
System.out.println("What is the capital of Canada");

String capital = keyboard.nextLine();

if( capital.equals("Ottawa")) {
	System.out.println("Your answer is correct!");
}else {
	System.out.println("your answer is incorrect");
	
	
}

}
}