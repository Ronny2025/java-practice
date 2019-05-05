package day07_scanner_operator;

public class PreAndPost2 {
	public static void main(String[] args) {
		int messages = 10;
		messages++; //11
		++messages; //12
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages;
		int unreadMessages = 11;
		
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages: " + readMessages);

	


	
	
	
	
	

	int count = 20;
	int count2 = 10;
	
	
	int totalCount = ++ count + --count2;
	System.out.println("count:"+count);
	System.out.println();
	System.out.println("totalCount: "+totalCount);
	
	
	}
}
	
	