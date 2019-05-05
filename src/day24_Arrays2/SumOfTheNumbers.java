package day24_Arrays2;

import java.util.Arrays;

public class SumOfTheNumbers {
public static void main(String[] args) {
	//let's create array of integers with length 3
	
	int[]numbers= new int[3];											
	//first value in array
	numbers[0]=5;
	//second value in array
	numbers[1]=10;
	//third value in array
	numbers[2]=20;
	System.out.println(numbers);
	System.out.println(Arrays.toString(numbers));
	int sum =0;
	//please you for loop, in order to loop through the array
	//and calculate sum of all elements
	//nunbers.lenghts=> returns number of elements in the array
	//the final field array .length can not be assigned
	//numbers.length = 5;
	
	for(int i = 0 ; i<numbers.length;i++)	{
		sum = sum + numbers[i];		
	}
	System.out.println("Sum: "+sum);
	//find largest value in the array
	int max = Integer.MIN_VALUE;
	for(int i = 0; i<numbers.length;i++) {
		if(numbers[i]>max) {
			max= numbers[i];		
					
		}
	}
	System.out.println("Max value:" +max);
	//task 
	//find min value in the array
	
	
}
}
