package day23_Arrays;

import java.util.*;

public class ConcatWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// please write a program where you have to take 6 words from user
		// concat words with a comma
		// if word is equals to java, skip this word
		// print summary at the end of the program
		// conditional operator: condition? if true: if false;
		// System.out.println("All words: " +(allWords.length()>1?
		// allwords.substring(0,allWords.length()-2) :""));

		String word = "";
		String allWords = "";

		for (int i = 0; i < 6; i++) {
			System.out.println("Type the word");
			word = scan.next();
			if (word.contentEquals("java")) {
				continue;

			}
			allWords += word + ", ";
		}
		System.out.println("All words: " + allWords);
		System.out.println("All words: " + (allWords.length() > 1 ? allWords.substring(0, allWords.length() - 2) : ""));

	}
}
