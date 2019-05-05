package day02_Exercises;
import java.util.Scanner;
public class Replit30SecondConverter {
public static void main(String[] args) {
	Scanner Scan= new Scanner(System.in);
	int  inputSeconds, hours, minutes, seconds;
System.out.println("\"Enter seconds:\"");
	inputSeconds  = Scan.nextInt();
	hours = inputSeconds/3600;
	minutes = (inputSeconds%3600)/60;
	seconds = (inputSeconds%3600%60);
	
	System.out.println( hours);
	System.out.println(minutes);
	System.out.println(seconds);
	
	
	System.out.println( hours  + " hours, " +  minutes  + " minutes, " + "and " + seconds + " seconds");
}
}
