package day02_Exercises;
import java.util.Scanner;
public class Replit31caffeineOverDose {
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE:
	    Scanner Scan = new Scanner(System.in);
	    System.out.println("Enter number of miligrams in a drink:");
	    int miligrams = Scan.nextInt();
	    int lethalDose = (10000/miligrams);
	    System.out.println(lethalDose);
	    System.out.println("It would take about "+ lethalDose+" drinks for a lethal overdose.");
}
}