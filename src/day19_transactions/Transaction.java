package day19_transactions;
import java.util.*;
public class Transaction {
public static void main(String[] args) {                          
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your current balance?");
	double balance = scan.nextDouble();
	int count = 0;
	
while (balance > 0) {	
	count++;//increase transaction by 1
System.out.println("What is your transaction #"+count+" amount?");
double transaction = scan.nextDouble();
//balance=balance- transaction
if(transaction>balance ) {
	System.out.println("your balance is about to be negative due to this transaction");
	//continue;//go on top of loop right away
}
balance -= transaction;
System.out.println("Current balance:" + balance);
}
System.out.println(" you have insufficient funds for any more transactions, your balance is " + balance);
System.out.println("Transaction total count:" + count);

}
}