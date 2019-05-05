package day23_Arrays;
import java.util.*;
public class Replit86catAnDogs {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int countOfCats = 0;
    int countOfDogs = 0;
    String word = scan.next();
    
    int count=word.length();
    String count1 = word.replace("cat","");
    int cats =count1.length();
    
    countOfCats = (count - cats)/3; 
 System.out.println(countOfCats);
  
   int box=word.length();
    String box1 = word.replace("dog","");
    int dogs =box1.length();
    
    countOfDogs = (box - dogs)/3;
    
 
 if(countOfCats == countOfDogs){
    System.out.println("true");
  }else{
    System.out.println("false");
  }
    
}
}
