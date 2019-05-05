package day25_Arrays03;

public class Shopping {
public static void main(String[] args) {
	
	String[]products = {"Timberland shoes", "H&M shirt", "Swatch Watch Watch", " Gucci Bag", " Adidas socks"};
	double[]prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
	int[]itemsId = {12345, 12346, 12347,12348, 12349,}; 
	//print count of products
	System.out.println("Products Count:"  + products.length);
	//check if product prices and items have same count
	System.out.println("Prices Count:"  + prices.length);
	
	System.out.println("Items Id Count:"  + itemsId.length);
	
	if(products.length == prices .length && products.length == itemsId.length) {System.out.println("Shopping list is good");
	}else {
		System.out.println(" something is wrong with this list");
		return;
		
	}
	
		//loop through products and print each one in separate line
		//for each loop =. se usa , pero tiene limitaciones 
		for(String p:products) {

				System.out.println(p);
		}	
	
		
		
	//prices==> for loop
	for(int i =0; i<prices.length; i++) {
		System.out.println(prices[i]);
	}
	//itemsId ==>print this in reverse order using a loop
	//print last item id
	System.out.println(itemsId[itemsId.length -1]);
	for(int idx = itemsId.length -1 ; idx >= 0;idx-- ) {
		System.out.println(itemsId[idx]);
	}
	//print a report with total price
	//Item 1: 12345 - Timberlnad Shoes - $120.0
	//......
	//total price;
	System.out.println("######YOUR SHOPPING RECEIPT");
	double totalPrice =0.0;
	
	for(int i = 0; i <products.length;i ++) {
		
		System.out.println("Item " +(i+1) + ":" + itemsId[i] + "-" + products[i]+ "-$" + prices[i] );
		totalPrice += prices[i];
		
	}
	
	System.out.println("Total Price: $ + totalPrice");
	
	//Find the most expensive item in your list and print it as a report
	//loop and find. Do not use Arrays class
	
	
	int maxIndex =0;
	double maxPrice =0;
	
	
	for(int j = 0; j <prices.length; j++) {
		if(prices[j] > maxPrice) {
			maxPrice = prices[j];
			maxIndex =j;
		}
	}
	 
	System.out.println(itemsId[maxIndex] + "-" + products[maxIndex] + "-$" + prices[maxIndex]);
	}
}



	


