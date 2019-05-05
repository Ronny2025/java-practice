package day15_string_manipulation;

public class GetNumberfromString {
	public static void main(String[] args) {
		String sentence = "I wrote [236] lines of code today";
		
		//assign t o variable and print the number between [and]
		int start = sentence.indexOf('[') + 1;
		int end = sentence.indexOf(']') ;
		String codeCount = sentence.substring(start,end);
		System.out.println("Lines of code:" + codeCount);
		//System.out.println("Lines of code:"  +sentence.substring(start,end) );
		
		
		int count = Integer.parseInt("123");
		if(count > 20) {
			System.out.println("Wrote more than 20 lines of code today!!!");			
		}else {
			System.out.println("Not enough coding:"  );
		}
	}
	

}
