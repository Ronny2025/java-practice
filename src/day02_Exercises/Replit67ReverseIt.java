package day02_Exercises;
import java.util.*;
public class Replit67ReverseIt {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String word2= "";
	 if (word.length()==5) {
		 word2=""+word.charAt(4) +""+ word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0);
		  
			 System.out.println(word2);
		   
			   
	   }else if (word.length()<5) {
		   System.out.println("Too short");
	   }else if(word.length()>5){
		   System.out.println("Too long");
	  
	   }
	 System.out.println("Enter word:");
	    String palabra1= scan.next();
	    
	    if( palabra1.length()>2) {
	    	System.out.println(palabra1);}
	    
	    
	 
	    	
	   }   
}    


