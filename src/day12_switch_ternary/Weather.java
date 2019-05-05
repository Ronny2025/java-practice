package day12_switch_ternary;
import java.util.Scanner;
	
public class Weather {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather today?");
		String weather = scan.next();
		switch (weather) {
		case"sunny":
			System.out.println("Go to park");
			System.out.println("Code java");
			break;
		case"hot":
			System.out.println("Go swimming");
			System.out.println("Code java");
			break;
		case"windy":
			System.out.println("Go fly a kite");
			System.out.println("Code java");
			break;
		case"rainy":
			System.out.println("Go shopping");
			System.out.println("Code java");
			break;
		case"snow":
			System.out.println("Change your tires");
			System.out.println("Code java");
			break;
		default:
			System.out.println("Code Java in any other weather");
			
			
			System.out.println("######END OF PROGRAM#####");
		
		}
		
		
		
	}

}
