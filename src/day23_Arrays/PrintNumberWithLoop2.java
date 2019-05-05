package day23_Arrays;

public class PrintNumberWithLoop2 {
public static void main(String[] args) {
	
	
	//PRINT a triangle by using nested loops like in the example below:
		//1
		//12
		//123
		//1234
		//12345
		//123456
		//1234567
		//123458910
		//Collapse

	for ( int j = 1; j <= 10; j++) {
		  for (int i = 1; i <= j; i ++) {	  
			  System.out.print(i+ " ");
	}
		System.out.println();
	}


	
	
}
}
