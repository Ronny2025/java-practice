package day02_Exercises;
import java.util.*;
public final class Replit40QuizQuestion {
public static void main(String[] args) {
	System.out.println("What is the fastest planet in the solar system:");
	System.out.println("a)venus");
	System.out.println("b)pluto");
	System.out.println("c)neptune");
	Scanner scan =  new Scanner (System.in);
      String a = scan.nextLine(); 
      if (a.equals("a")) {System.out.println(a + " is wrong");
      } else if (a.equals("b")) {System.out.println(a + " is correct");
      } else if (a.equals("c")) {System.out.println(a + " is wrong");
      } else if (a.equals("z")){System.out.println(a + " is not a valid answer");
      }
      }
}



	

