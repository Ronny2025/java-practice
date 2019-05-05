package day28_multi_arrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		//read all data and assign to String array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: " + data.length);
		//print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		//print last restaurant
		System.out.println(data[data.length-1]);
		//System.out.println(Arrays.toString(data));
		//print each Resturant information in separate line
		int counter =0;
		for(String restaurant : data) {
			System.out.println("#"+counter+"=>"+restaurant);
			counter++;
		}
		//print all restaurant information in state of VA
		
		int countVA = 0;
		for(String row : data) {
			if(row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
				
			}
		}
	
		System.out.println("Restaurants in VA: " + countVA);
		
		//print all restaurant names along with citynames
		//subway Herndon
		for(String res : data) {
			if(res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]);
			}
		}
	}
}
