package day02_Exercises;
import java.util.*;
public class Replit60PrintLastCharacter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word;
	System.out.println("Enter word:");
	word = scan.next();
	System.out.println(word.charAt(0));
	System.out.println(word.length());
	System.out.println(word.length()-1);
	System.out.println(word.charAt(word.length()-1));
	
	System.out.println(word.charAt(word.length()-3));
	
	
}



	
}


