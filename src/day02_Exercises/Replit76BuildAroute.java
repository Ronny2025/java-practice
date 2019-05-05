package day02_Exercises;
import java.util.*;
public class Replit76BuildAroute {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String start = scan.next();
    String end = scan.next();
    String s ="A right >B down > C left > D up >A right >B Down >C left";
    if(start.equalsIgnoreCase(end)) 
    {
          System.out.println(start+ " found");
    }
    else{
      s= s.substring(s.indexOf(start),s.length()-1);
       s= s.substring(s.indexOf(start),s.indexOf(end));
        s= s.replace("A","").replace("B","").replace("C","").replace("D","");
        s= s.substring(1,s.length()-2);
        System.out.println(s+ ":" + end  +" found");
        
    }
    }
}
    


