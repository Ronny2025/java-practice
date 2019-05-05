package day21_loops_review;

public class UniqueCharacters {
public static void main(String[] args) {
	             //012345 
	String word = "javva";
	String unique = "";
	
	char ch = word.charAt(0);
	System.out.println(unique.contains(""+ch));
	if(!unique.contains(""+ch)) {
		unique += ch; //unique = unique+ch;
	}
	
	System.out.println("Unique:" + unique);
	
	
	
	
	
	
}
}
