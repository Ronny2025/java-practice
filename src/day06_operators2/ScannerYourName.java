package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);// create scanner object scan Scanner(System.in);
		System.out.println("Hi, What is our name?");
		String name = scan.next(); // accept String input
		System.out.println("nice to meet you, "+name);
		
		Scanner peru=new Scanner(System.in);
		System.out.println("How old are you?");
		String age = peru.next();
		System.out.println("You are, "+ age + "?");
		
		Scanner lima=new Scanner(System.in);
		System.out.println( "Where do you live? ");
		String city =lima.next();
		System.out.println(city +" is very nice, and it is growing fast");
		
		Scanner puentepiedra=new Scanner(System.in);
		System.out.println("Do you like sea food? ");
		String food = puentepiedra.next();
		System.out.println(food + " Yeah, Me Too!");
		
		Scanner sanjose = new Scanner(System.in);
		System.out.println("Would you go out with me?");
		String answer = sanjose.next();
		System.out.println(answer + " I knew it");
		
		Scanner cervantes = new Scanner(System.in);
		System.out.println("Are you salvadorian?");
		String nationality = cervantes.next();
		System.out.println(nationality + " am peruvian");
	
	
	}
	

}
