package day23_Arrays;
import java.util.*;
public class Prime_Number {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int count=0;
	for (int i = 2;  i<= num ;i ++) {
		
		if(num%i==0) {
			count++;
		}
		
		
	}if(count>1) {
		System.out.println("not prime");
	}else System.out.println(num +" is prime");


	

}
}
