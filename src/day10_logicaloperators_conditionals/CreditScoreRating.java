package day10_logicaloperators_conditionals;
import java.util.Scanner;

public class CreditScoreRating {
	public static void main(String [] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println (" Enter oyour credit score:");
		int creditScore = 800;
		
		//Excellent =>750 -850
		if (creditScore >= 750 && creditScore <= 850) {
			System.out.println("Excellent");
		}else if (creditScore >= 700 && creditScore <=749){
			System.out.println("Good");
			
			
		}
		
		
	}

}
