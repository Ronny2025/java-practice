package day16_string_manipulation;

public class Concat {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.concat("+Selenium"));
		System.out.println(word.concat("+Eclipse"));
		word = word.concat(  "Automation");
		System.out.println(word);
		
		word =word + true;//concat true to the string
		System.out.println(word);
		String word2 = "Hi";
		
		word2 = word2.concat("-hey").concat("-how are you");
		System.out.println(word2);
	}

}
