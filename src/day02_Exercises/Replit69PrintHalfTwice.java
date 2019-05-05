package day02_Exercises;
import java.util.*;
public class Replit69PrintHalfTwice {
	public static void main(String[] args) {
		
	 Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	   // Write a program that will print out first half of the word twice. 
	  System.out.println(word.substring(0,word.length()/2));
	String peru= word.substring(0, word.length()/2);
	System.out.println(peru + peru);
	
}
	
}