package day09_stringequals_conditionals;
import java.util.Scanner;
public class SeniorCitizens {
	public static void main(String[] args) {
		
	
	int seniorCitizens, nonSeniorCitizens;
    int age;
    Scanner scan = new Scanner (System.in);

    System.out.println(" Enter current count for senior Citizens and non Citizens:");
    seniorCitizens = scan.nextInt();
    nonSeniorCitizens = scan.nextInt();
    
    System.out.println("What is new citizen's age?");
    age = scan. nextInt();
    if(age >= 65) {
    System.out.println("Senior Citizen");
    }else {
    	System.out.println("Non Senior Citizen");
    	
    
    
    
}
	}
	}
