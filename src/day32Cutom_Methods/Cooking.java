package day32Cutom_Methods;

public class Cooking {
	
	public static void main(String[] args) {
    makePancakes();
    makePasta();
    makePancakes();
    cook("Omelette", "Eggs,SAlt, Tomatoes, Green Peppers, onions");
	}
	
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase()+ "RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~"+dish.toUpperCase()+"IS READY!~~");
	}
public static void makePasta( ) {
	System.out.println("~~ITALIANPASTA RECIPE~~");
	add("Water,Salt, Olive oil");
	boil(2);
	add("Spagetti Pasta");
	boil(9);
	mix(60);
	System.out.println("~~DELICIOUS PASTA IS READY~~");
}
	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, flour, Sugar, Salt");
		mix(120);
		fry(3);
	}

	public static void add(String ing) {
		System.out.println("ADD" + ing);

	}

	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + "seconds");
	}

	public static void fry(int minutes) {	
		System.out.println("Fry for " + minutes + " minutes");
	}
	
	public static void boil(int minutes) {
		System.out.println("Boil it for " + minutes + " minutes");
	
	
}
}