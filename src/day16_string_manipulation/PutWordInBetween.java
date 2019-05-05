package day16_string_manipulation;

public class PutWordInBetween {
public static void main(String[] args) {
	String chars = "t{}}";
	String word = "java";
	
	
	String result = chars.substring(0,2) + word;  
	System.out.println(result);
	
	
}
}
