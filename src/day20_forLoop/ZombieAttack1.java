package day20_forLoop;
import java.util.*;
public class ZombieAttack1 {
public static void main(String[] args) {
	Scanner scan = new Scanner ( System.in);
	System.out.println("Enter inhabitants:");
int inhabitants = scan.nextInt();
	int day= 0;
	while(inhabitants>0) {
		System.out.println("Day " +day+"[" + inhabitants +"]");
		day++; //add to day
		inhabitants = inhabitants /2;//decrease by half
	} 
	System.out.println("---- EXTINCT ----");
}
}
