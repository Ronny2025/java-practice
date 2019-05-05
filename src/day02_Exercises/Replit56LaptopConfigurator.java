package day02_Exercises;
import java.util.*;
public class Replit56LaptopConfigurator {
public static void main(String[] args) {
	double price = 0;
	String storageType,  screenType;
	String cpu;
	int ram = 0 ;
	Scanner scan = new Scanner(System.in);
//WRITE YOUR CODE HERE First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the 
	//laptop price. If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  17.3 - 
	//add  $400 to the laptop price.  Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price. 
	//If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350 to the laptop price. 
	//Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type. 
	//There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 
	//to the laptop price for every 500GB. Then ask user for for screen resolution. There are 2 options: FULLHD and 4K. 
	//Add $100 if it's FULLHD screen and $200 if it's 4K screen
	
	System.out.println("Select Screen Size:");
	screenType = scan.next();
 	
	if(screenType == "13.3") {price = price + 200;
	
	}else if (screenType=="15.0") {price = price + 300;
	
	}else if (screenType=="17.3") {price= price + 400;
	
	}
System.out.println("Select CPU type:"); 
cpu=scan.next();

if(cpu.equals("i3")) {price = price + 150;
}else if(cpu.equals("i5")) {price = price +250;
}else if(cpu.equals("i7")) {price = price + 350;
}
System.out.println(price);
}


}

