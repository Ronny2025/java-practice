package day24_Arrays2;

public class CarShop {
public static void main(String[] args) {
	//BMW,Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
	//1)create an Array of strings an store these cars inside the Array
	
	String []cars= {"BMW,Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla"};
	// 2) step ; print car names that start with M
	
	for (String c : cars) {
		if (!c.startsWith("M")){
			continue;
		}
		System.out.println(c);
	
		
	}
}
}
