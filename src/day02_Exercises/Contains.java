package day02_Exercises;

public class Contains {
public static void main(String[] args) {
	String email = "test@gmail";
	System.out.println( email.contains("@"));
	
	String list = "potatoes, apples, tomaotes, eggs, milk , bread, cereal, meat";
	//check if apples is in the shopping list
	
	//true ==> Apples are there!
	//false == lets add apples now!
if (list.contains("apples")) {
	System.out.println("Apples are there!");
}else {System.out.println("List add apples now");
}

 boolean hasEggs = list.contains("eggs");
 System.out.println("Contains eggs:" + hasEggs);
 boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
 
 System.out.println("Contains cucumbers: " + hasCucumbers);
 
 
 email = "name@yahoo.com";
 
 if(email.contains("yahoo")){
 System.out.println("It is yahoo account");
}else if (email.contains("@gmail")) {
System.out.println("Gmail account");
}else if(email.contains("hotmail")) {
	System.out.println("hotmail account");
}
}
} 




