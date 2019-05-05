package day02_Exercises;
import java.util.*;
public class Replit66MergeThem {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter words:");
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //You have 2 words, both of them have 3 characters.
	    //If either of them does not have exactly 3 characters, print "cannot merge"
	   // Merge their characters one by one and print together like below:
	    //YOUR CODE HERE
	    if( word1.length() < 3 || word1.length()>3) {
	 	System.out.println("cannot merge");
	    } 
	    if( word2.length()> 3 || word2.length() >3) {	
	     System.out.println("cannot merge");
	     
	    }
	    System.out.println(word1.charAt(0) +""+ word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+ ""+word1.charAt(2)+""+word2.charAt(2));
	    }
}
