package day02_Exercises;

import java.util.*;

public class Replit85ShoppingList2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		do {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
			totalPrice += price;
			System.out.println("Add one more Item?");
			countinue = scan.next();

			if (!countinue.equals("yes")) {
				break;
			}
			count++;
		} while (count <= 10);
		System.out.println(shoppingListReport.substring(0, shoppingListReport.length() - 2));

		System.out.println("Total price: " + totalPrice);

	}

}
