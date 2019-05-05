package day02_Exercises;
import java.util.*;
public class Replit65MiddleThree {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
	
	
	if (word.length()>=5 && word.length() % 2==1){
		System.out.print(word.charAt(word.length()/2-1));
		System.out.print(word.charAt(word.length()/2)); 
		System.out.println(word.charAt(word.length()/2+1));
	}
	else {System.out.println("invalid"); 
	
	}
	
	
}
}
