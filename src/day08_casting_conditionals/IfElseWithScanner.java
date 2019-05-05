package day08_casting_conditionals;
import java.util.Scanner;
public class IfElseWithScanner {
	public static void main(String[] args) {
		//passing Percentage = 65;
		//yourSCorePercentage = take from scanner
		//check if you passed or failed
		
		Scanner input = new Scanner(System.in);
		
		int passingPercentage = 65;
		
		System.out.println("What is your score?");
		int yourScorePercentage = input.nextInt();
		if(yourScorePercentage >= passingPercentage) {
			System.out.println("YOU PASSED! CONGRATULATIONS!");
		}else{
			System.out.println("YOU FAILED! STUDY MORE! DON'T BE SAD!");
		}
		System.out.println("JAVA IS fUN!");
			
		}
		
		
		
	}



