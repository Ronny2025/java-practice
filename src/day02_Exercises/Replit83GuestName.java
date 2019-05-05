package day02_Exercises;
import java.util.*;
public class Replit83GuestName {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter guest name:");
	String name = scan.next();
	System.out.println("Do you want to enter new guest name:");
	String guestName= scan.next();
	while(guestName.equalsIgnoreCase("Yes")) {
	
	System.out.println("Please enter guest name:");
	name+=", " + scan.next();
	System.out.println("Do you want to enter new guest name:");
	guestName=scan.next();
}
	System.out.println("Guest's list: " + name);
}
}