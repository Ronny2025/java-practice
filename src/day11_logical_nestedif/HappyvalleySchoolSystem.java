package day11_logical_nestedif;
  
import java.util.Scanner;

public class HappyvalleySchoolSystem {
	public static void main(String[] args) {

	

 Scanner scan= new Scanner(System.in);

    System.out.println("Enter age:");
	//int age = 10; Harcode value
	int age = scan.nextInt();//Dynamic value
	//int age =1;
	if(age < 2|| age > 18) {
		System.out.println("Inelegible");
	}else if(age== 2) {
		System.out.println("toddler");
	}else if (age >= 3 && age <= 5) {//3-5(age == 3 || age == 4 || age==5)
		
		System.out.println("early childhood");
	}else if (age ==6 || age == 7) {//age >= 6 && age<= 7)
		System.out.println(" younger reader");
		}
	
}
	}
