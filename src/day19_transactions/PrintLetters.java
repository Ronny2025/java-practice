package day19_transactions;

public class PrintLetters {
public static void main(String[] args) {
	String word = "Amazon";
	//012345(index)
	//123456(length)
	//print each character one by one in separate lines
	int idx = 0;
	while(idx < word.length()) {
		System.out.println(word.charAt(idx));     //1 true.idx = 0 A
		                                          //2 true idx  = 1 m
		idx++;
	}
	//print each character in reverse order
 int idx2 = word.length() -1; //5
 while (idx2 >=0 ) {System.out.println(word.charAt(idx2)); 
 idx2--;
 }
}
}
