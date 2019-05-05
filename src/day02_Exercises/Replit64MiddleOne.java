package day02_Exercises;

import java.util.Scanner;

public class Replit64MiddleOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = scan.next();
		// YOUR CODE HERE

		if (word.length() >= 3 && word.length() % 2 == 1) {
			System.out.println(word.charAt((word.length() - 1) / 2));

			//System.out.println("Enter word:");
			//String word = scan.next();
		} else if (word.length() == 1) {
				
			
				System.out.print(word.charAt(0));
				System.out.print(word.charAt(0));
				System.out.print(word.charAt(0));
			
		} else if (word.length() >= 4 && word.length() % 2 == 0) {
			System.out.print(word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2));
			// System.out.println(word.charAt(word.length()/2)) ;

		}else if(word.length()==2) {System.out.println(word + word);

		// if(word.length()==2) {System.out.print(word+word);
	}
	}
}
