package day08_casting_conditionals;
   import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		
		//A,B,C,D
		// char grade = scan.next().charAt(0);
		
		//if grade 'A' =>
		/*   Excellent Job! Keep it up!
		 * else 
		 * how many points did you miss for 'A'?
		 * int points= scanner
		 * print  "you grade B is not good enough."
		 *        "You could earn 10 more points if you studied harder."
		 /*/      
		  
	     System.out.println("### START PROGRAM ###");
		Scanner Keyboard= new Scanner(System.in);		
		System.out.println("What is your grade?");
		char grade = Keyboard.next().toUpperCase().charAt(0);
		if(grade == 'A') {
			System.out.println("Excellent job! Keep it up");
		}else{
			System.out.println("your grade "+grade+ "is good enough");
			System.out.println("How many points did you miss for 'A'?");
			int points = Keyboard.nextInt();
			System.out.println("you could earn "+points+" more points if you studied harder");
			
			System.out.println("### END PROGRAM ###");
			
			
			
			
		}
		
		
	}
	
}
