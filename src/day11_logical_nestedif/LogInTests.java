package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests{

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	String username;
	String password;
	
	String validUserName = "Cybertek@gmail.com";
	String validPassword = "WoodenSpoon123";
			
	
	System.out.println("Enter Username");
	username = scan.next();
	System.out.println("Enter password");
	password = scan.next();
	
	if (username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
		System.out.println("Login Successful, Welcome!");
		
	}else if(!username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
		System.out.println("Invalid Username and Invalid Password");
	}else if(username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
		System.out.println("Invalid Password");
	}else if(!username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
		System.out.println("invalid Username");
		
		
	
	
		
		
	}
}
	
	
}
