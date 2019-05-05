package day15_string_manipulation;

public class Substring {

	public static void main(String[] args) {
		String sentence = "Java string manipulation is fun!";
		System.out.println(sentence.substring(0,4));//Java
		//print String
		
		
		System.out.println(sentence.substring(5, 11));//String
		System.out.println(sentence.substring(7,11));//ring;
		
		System.out.println(sentence.substring(7,11));//ring
		//System.out.println(sentence.substring(10,50));
	}
	
}
