package day37_arraylist;
import java.util.*;
public class MyCities {
public static void main(String[] args) {
	ArrayList<String>cities =  new ArrayList<>();
	cities.add("Barnaul");
	cities.add("Dushambe");
	cities.add("Sterling");
	cities.add("Baku");
	cities.add("Tashkent");
	
	//print each city using for each loop separated by space
	for(String city : cities) {
		System.out.println(city +"");
	}
	System.out.println();
	////print each city using for loop separated by space
	for(int i=0; i<cities.size(); i++){
		System.out.println(cities.get(i)+"");
		
	}
	// remove Baku
	
	System.out.println("Removing Baku");
	cities.remove("baku");
	cities.remove("New York"); //it will not remove ot show error
	System.out.println(cities.toString());
	
	//is empty?
	System.out.println("is list empty? " + cities.isEmpty());
	cities.add(0, "Bishkek");
	System.out.println(cities.toString());
	
	cities.add(1, "Istanbul");
	System.out.println(cities.toString());
	
	cities.set(2, "Seul");
	System.out.println(cities.toString());
	
	int idx = cities.indexOf("Sterling");
	System.out.println("Sterling idex: " + idx);
	cities.set(idx,"Zagreb");
	System.out.println(cities.toString());
	
	cities.clear();
	boolean empty =cities.isEmpty();
	System.out.println("empty: " + empty);
	
	
	
	
}
}
