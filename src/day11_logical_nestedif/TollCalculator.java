package day11_logical_nestedif;

	import java.util.Scanner;
public class TollCalculator {
	
	public static void main( String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter Vehicle Type: "); //1, 2
		int cartype = keyboard.nextInt ();
		
		System.out.println(" Is it rush hour: yes | no");
		String rushHour = keyboard.next();
		
		// check if rushHour string is "yes" => assign true to isRushHour
		//if it is "no' ,assign false to is RushHour
		
		boolean isRushHour;
		if(rushHour.equalsIgnoreCase("yes")) {	
			isRushHour = true;
		}else {
			isRushHour = false;
			
	}
		//System.out.println(isRushHour);
		double price = 0.0;
		if(cartype == 1) {
			if(isRushHour) {
			   price = 30.0;//A
			}else{
				price =5.0;//B
			}
		}else if (cartype == 2) {
			if(isRushHour) {	
				price = 55.30;//C
			}else {
				price =15.99;//D
				
				
			
		}
			System.out.println("Toll cost: " + price);	
		}
	}
}
