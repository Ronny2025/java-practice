package day02_Exercises;
import java.util.*;
public class ReplitSMSMessage74 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
	//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
      String sender = message.substring( message.indexOf("<")+1   ,message.indexOf(">"));
      System.out.println(sender);
      String phoneNumber = message.substring( message.indexOf ("[")+1 ,message.indexOf("]"));
      System.out.println(phoneNumber);
      
      String Message = message.substring( message.indexOf ("{")+1 ,message.indexOf("}"));
      System.out.println(Message);
      
     
      
	}

}
