package day19_transactions;

public class DoWhileRunOnce {
public static void main(String[] args) {
	
	//in this example, do while loop body code will run once then tehdr the condition. then exit the loop,as condition is true.
	
	int count =10;
	
	do {
		System.out.println("Count: " + count);
		count++;
	
	}while (count <=5);
}
}
