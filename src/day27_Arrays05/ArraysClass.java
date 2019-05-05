package day27_Arrays05;
import java.util.*;
public class ArraysClass {
public static void main(String[] args) {
	int[]nums = {43,12,4,1,3,5};
	//to String method
	System.out.println(Arrays.toString(nums));
	String str = Arrays.toString(nums);
	System.out.println(str);
	
	//sort method, sort Array in ascending order.  when sorting string values, order will be this way
	// numbers>UPPERCASE>lowercase.
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	String[] languages = {"zulu", "spanish", "Italian", "german", "chinese"};
	System.out.println(Arrays.toString(languages));
	
	Arrays.sort(languages);
	System.out.println(Arrays.toString( languages));
	
	
	int[]nums2 = {345,665,333,11,3,66};
	//finds lower and largest values from nums2 array
	Arrays.sort(nums2);
	int lowest = nums2[0];
	int largest = nums2[ nums2.length -1 ];
	
	System.out.println("Lowest num: " + lowest);
	System.out.println("Largest num: " + largest);
	
	
	//BINARYSEARCH ==>searches for value in the array and returns index.
	//int nums[]= {4, 10, 20, 50};
	//Array binary search (nums, 10) ==> 1
	//Array binary search (nums, 20) ==> 2
	 
	
	
}
}
