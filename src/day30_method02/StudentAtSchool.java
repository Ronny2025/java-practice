package day30_method02;

public class StudentAtSchool {
public static void main(String[] args) {
           study("Selenium");     //tienes que poner string dentro => 
	       study("SQL");
	       sleep(5);
}	

	
	
	
	public static void study(String topic ) {
		System.out.println("Student is stuying " + topic);
	}
	
	
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for " +hours+ "hours");
	}
	
}
