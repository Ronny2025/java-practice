package day28_multi_arrays;

import java.util.Arrays;

public class ReverseSentence {
public static void main(String[] args) {
	//1) Reversing sentence.
	//Create a class ReverseSentence
	//Create a String variable sentence and assign value
	//- find out and print number of words
	//- reverse the sentence and assign to new String called reversed
	//- print the reversed

	//String sentence = "you are very interesting person";
	//5 words
	//person interesting very are you

	//"you love java"
	//"java love you"
	String sentence ="you love java"; //"you are very interesting person";
	//split by space
	String[]arrSentence = sentence.split(" ");
	System.out.println("Number of words:" + arrSentence.length);
	System.out.println(Arrays.toString(arrSentence));
	String reversed = "";
	for(int i = arrSentence.length-1; i >=0; i--) {
		//System.out.println(arrSentence[i]);
		reversed+=arrSentence[i]+" ";
		//System.out.println(reversed);
	}
	reversed=reversed.trim();
	System.out.println(reversed);
}
}
