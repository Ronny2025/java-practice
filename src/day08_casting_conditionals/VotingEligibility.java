package day08_casting_conditionals;
import java.util.Scanner;
public class VotingEligibility {
	public static void main(String[] args) {
		
		
	/*
	 program to tell if you are elegible to vote.
	 votinAge = 18
	 yourAge = take from scanner
	 if you are eligible to vote:
	 you are eligible to vote.
	 you have been eligible to vote.
	 you have been eligible for 3 years 
	 else
	 you are not eligible to vote
	 you still have 3 more years to go
	 */
		
		Scanner keyboard = new Scanner(System.in);
		int votingAge =18;
		
		System.out.println("How old are you?");
		int yourAge = keyboard.nextInt();
		int years = yourAge - votingAge;
		if(yourAge >= votingAge) {

			System.out.println("you are aligible to vote."); 
			System.out.println("you have been eligible for "+years+" years");
		}else{
			System.out.println("you are not elegible to vote");
			System.out.println("you still have "+years+" more years to go");
			//System.out.println("you still have "+(-years)+" more years to go"); to take the negative number
			//from result
			//System.out.println("you still have "+ moreYears +" more years to go"); to take the negative number
			//from result
			
		}
		
	}

}
