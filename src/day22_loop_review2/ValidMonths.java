package day22_loop_review2;
import java.util.*;
public class ValidMonths {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//Valid months: 
    // 1,2,3,4,5,6,7,8,9,10,11,12
    //Enter month:
	// 1
	// Enter month:
	// 5
    //Enter month:
	//15
	// Invalid month - 15
	//DO WHILE loop.


	

    int month;//declare month variable
    
    do {
        System.out.println("Enter month");
        month = scan.nextInt();     
    }while(month >= 1 && month <= 12);
    
    System.out.println("Invalid Month - " + month);
	
}
}
