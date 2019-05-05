package day02_Exercises;

public class OfficeHours {
public static void main(String[] args) {
	
	 //0123456
	String today = "tuesday";
	//print tues
	//print day
	String t = today.substring(0, 4);
	String d = today.substring(4);
	System.out.println(t +"\n"+ d);
	System.out.println(today.substring(2,3));//e
	System.out.println(today.substring(4,5));//d
	int i = 4;
	System.out.println(today.charAt(i));
	
	for(i = 0;  i < today.length(); i++ ) {
		System.out.println(today.charAt(i));
		System.out.println(today.substring(i,i+1));
	}
	// 0123456
	//"tuesday"; print in reverse order
	for(int j = today.length()-1; j >= 0; j--) {
		System.out.print(today.charAt(j)+" ");
	}
	System.out.println();	
	for(int m = today.length()-1; m >= 0; m--) {
		System.out.print(today.substring(m, m+1)+" ");
	}
	System.out.println();
	//assign to variable
	String word = "eclipse";
	String reversed = "";
	//876543210
	for(int r = word.length()-1; r >= 0; r--) {
		//System.out.print(word.charAt(r));
		//read character and add to reversed
		reversed += word.charAt(r);
	}
	System.out.println(reversed);
	
	//check if it palindorome
	// civic
	// mom
	// dad
	// madam --> racecar --> 
	
	if(reversed.equalsIgnoreCase(word)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
	
	
	
	
	
}
}