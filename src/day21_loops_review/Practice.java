package day21_loops_review;
import java.util.*;
public class Practice {
public static void main(String[] args) {               


		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		//int sumOfSums=0;
		
		do {
			System.out.println("Enter 2 numbers");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum=num1+num2;
			//sumOfSums += sum;
		}while(sum <= 100);
		
		System.out.println("Good Numbers");
		
		
		
	
		



//public class NumberMoreThan100 {
	//public static void main(String[] args) {
	//Scanner scan = new Scanner(System.in);
	//int sum1, sum2; 
	//int sum = 0;
	//do {
	//System.out.println(" Enter 2 ints:");
	//sum1 = scan.nextInt();
	//sum2 = scan.nextInt();
	//sum =sum1 + sum2 ;
	//System.out.println(sum);
	//}while(sum <= 100);
	
	
	//System.out.println("Good Numbers");
	
}
}
