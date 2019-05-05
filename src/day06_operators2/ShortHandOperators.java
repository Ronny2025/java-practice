package day06_operators2;

public class ShortHandOperators {

	public static void main(String[] args) {
		int Students = 45;
		System.out.println("Students " + Students);
		Students = Students + 5;
		System.out.println("Students " + Students);
		
		Students = Students - 2;
		System.out.println("Students " + Students);
		Students = Students - 5;
		System.out.println("Students " + Students);
		 int cars = 12;
		 System.out.println("cars: " + cars);
		
		 int shoes = 20;
		 shoes /=4;
		 System.out.println("shoes : " + shoes);
		 double price = 45.50;
		 int amount = 5;
		 price += amount;
		 System.out.println(price);
		 int minutes = 60;
		 minutes %= 60;
		 System.out.println("remaining :" + minutes);
		 int pennies = 550;
		 pennies %=100; 
		 System.out.println("pennies left: " + pennies);
		 int apples = 10;
		 apples =-3;
		 System.out.println(apples);
		 	
		
		
	}
	
}
