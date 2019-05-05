package day02_Exercises;
import java.util.*;
public class Replit37Nums {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in); 
	int num1, num2;
	System.out.println("Enter 2 numbers:");
	num1 = scan.nextInt();
	num2 = scan.nextInt();

	if (num1==num2) {System.out.println(num1+ " and " + num2 + " are equal ");
	} else if(num1>num2) {System.out.println(num1+ " is greater than " +num2);
	
	} else if (num1<num2) {System.out.println(num2+ " is greater than " +num1);
	
	}
}

}	
