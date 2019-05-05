package day02_Exercises;
import java.util.*;
public class Replit35PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = input.nextInt();
		
		
		
		if(number > 0) {System.out.println(number+ " is positive ");
		}else if(number< 0) {System.out.println(number+ " is negative");
		
		}else {System.out.println("it is Zero");
		
		}
	}
}