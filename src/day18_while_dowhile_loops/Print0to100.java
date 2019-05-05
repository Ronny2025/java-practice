package day18_while_dowhile_loops;
import java.util.*;
public class Print0to100 {
public static void main(String[] args) {
	int counter =0;
	
	while(counter <= 100) {
	
		System.out.println(counter);
		counter++; // counter = counter - 1;
	}
	System.out.println("counter: " +counter);
}
}