package day02_Exercises;
import java.util.Scanner;
public class Replit33Citizens {
public static void main( String[] args) {

int seniorCitizens, nonseniorCitizens;
System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
Scanner scan = new Scanner(System.in);
seniorCitizens = scan.nextInt();
nonseniorCitizens = scan.nextInt();
System.out.println("What is new citizen's age?");
int newCitizenAge = scan.nextInt();

if(newCitizenAge >= 65) {
	System.out.println("Senior Citizen");
	seniorCitizens++;
	System.out.println("New seniorCitizen count " + seniorCitizens); 
	System.out.println("New nonSeniorCitizens count " + nonseniorCitizens);
}else {System.out.println("Non-Senior Citizen");

//nonseniorCitizens = +1;
//nonseniorCitizens += 1;
nonseniorCitizens++;
System.out.println("New SeniorCitizens count " + seniorCitizens);
System.out.println("New nonSeniorCitizens count " + nonseniorCitizens);


}
}
}