package day20_forLoop;

public class PrintEachChar {
public static void main(String[] args) {
	String word = "CybertekSchool";
	//using for loop, print each char one by one
	for(int i = 0; i < word.length(); i++) {
		System.out.println(word.charAt(i));
	}

	
	//using for loop, print only vowel (a,e,o,i,u)
	for(int i = 0; i < word.length(); i++) {
		char letter = word.toLowerCase().charAt(i);
		if(letter == 'a' || letter == 'e' || letter == 'o' ||
		   letter == 'i' || letter == 'u'	) {
			System.out.print(letter + ", ");
		}
	}
	System.out.println();
	//using for loop, print only consonants
	for(int i = 0; i < word.length(); i++) {
		char letter = word.toLowerCase().charAt(i);
		if( !(letter == 'a' || letter == 'e' || letter == 'o' ||   //signo de exclamacion para no sacar las vocales si no las consonantes
		   letter == 'i' || letter == 'u') ) {                     // <=despues de if si lo sacas obtendras las vocales.
		   System.out.print(letter + ", ");
		}
	}
	
}
}
