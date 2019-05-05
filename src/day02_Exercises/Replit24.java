package day02_Exercises;
import java.util.Scanner;
public class Replit24 {
	public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String firstName, lastName, email, street, city, state;
    int age, zipcode;
    double height, weight;
    boolean isMarried;
    long workPhoneNumber, persPhoneNumber;
    
    System.out.println("Welcome to the patient portal!");
    System.out.println("Please enter your personal information");
    
    System.out.println("Enter your first name");
    firstName = scan.nextLine();
    
    System.out.println("Enter your last name");
    lastName = scan.nextLine();
    
    System.out.println("Enter your email");
    email = scan.nextLine();
    
    System.out.println("Enter your street");
    street = scan.nextLine();
    
    System.out.println("Enter your city");
    city = scan.next();
    
    System.out.println("Enter your state");
    state = scan.next();
    
    System.out.println("Enter your zip code");
    zipcode = scan.nextInt();
    
    System.out.println("Enter your work phone number");
    workPhoneNumber = scan.nextLong();
    
    System.out.println("Enter your personal phone number");
    persPhoneNumber = scan.nextLong();
    
    System.out.println("Enter your age");
    age = scan.nextInt();
    
    System.out.println("Enter your height");
    height = scan.nextDouble();
    System.out.println("Enter your weight");
    weight = scan.nextDouble();
    
    System.out.println("Are you married?");
    isMarried = scan.nextBoolean();
//    System.out.print(isMarried);

      scan.close();
    
    System.out.println("Patient personal information\nFull name: "+lastName+", "+firstName+
    "\nAddress: "+street+", "+city+", "+state+" "+zipcode+
    "\nContacts: work phone number - "+workPhoneNumber+", personal phone number - "+persPhoneNumber+", email: "+email+
    "\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds\nMarried?: "+isMarried);
    
		
}
}