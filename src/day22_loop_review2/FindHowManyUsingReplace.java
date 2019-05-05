package day22_loop_review2;

public class FindHowManyUsingReplace {
public static void main(String[] args) {
	
	
	String word = "ineceluding webpages, images";
	//find how many e characters in the word.
	//get the length of word
	//replace all e with empty
	//get the length of word without e
	//do a minus
	
	int length1 = word.length();
	word = word.replace("e", "");
	int length2 = word.length();
	
	System.out.println("Length1: " + length1);
	System.out.println("Length2: " + length2);
	
	int count = length1 - length2;
	System.out.println("Count of e: " + count);
	
	
String WorldWarZ = "zombies attak today";
int lengthZ = WorldWarZ.length();
System.out.println(WorldWarZ);
System.out.println(WorldWarZ.length());
WorldWarZ= WorldWarZ.replace("e","o");
System.out.println(WorldWarZ);
WorldWarZ=WorldWarZ.replace("a", "");
System.out.println(WorldWarZ.length());
int lengthZ1= WorldWarZ.length();
System.out.println(lengthZ1);
int countzombies =lengthZ - lengthZ1;
System.out.println("Count Zombies: " + countzombies);
}
}