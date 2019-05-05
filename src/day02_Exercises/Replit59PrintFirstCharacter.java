package day02_Exercises;
import java.util.*;
public class Replit59PrintFirstCharacter {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter word: ");
	    String word = scan.next();

	    System.out.println(word.charAt(0));
	    System.out.println(word.charAt(1));
	    System.out.println(word.charAt(2));
	    System.out.println(word.charAt(3));
	    System.out.println(word.length());
	    System.out.println(word.indexOf("o"));
}
}
