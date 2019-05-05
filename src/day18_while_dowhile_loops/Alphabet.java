package day18_while_dowhile_loops;

public class Alphabet {
public static void main(String[] args) {
	char Letter ='a';
	while (Letter <= 'z') {
		System.out.print(Letter +" ");
		Letter ++;
		
	}
	System.out.println();//new line
	char capitals ='A';
	while (capitals <= 'Z') {
		System.out.println(capitals + " ");
		capitals ++;
		
	}
	System.out.println();
	String letters = "";
	char myLetter = 'A';
	
	while(myLetter <= 'Z') {
		letters = letters + myLetter;
		System.out.println(letters);
		myLetter++;
	}





}
	

}
