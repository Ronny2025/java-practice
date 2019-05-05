package day13_ternay_strings_intro;

public class MoreTeernary {
	public static void main(String[] args) {
		String quality = "good";
		int rating = (quality.equals("good"))? 100 : 0;
		System.out.println("Rating: " + rating);
		
		int PMHour =6;
		//Rush hour during evening:4 - 7
		
		
		boolean rushHour = (PMHour >= 4 && PMHour <=7)? true : false;
		 
		System.out.println (PMHour + " is rush hour? " + rushHour);
		
		
		int AmHOur = 8; //6 - 9
		//6 - 9 amRushHour - YES, NO
		String amRushHour = AmHOur >= 6 && AmHOur <=9 ?  "yes" : "false";
		
		System.out.println(AmHOur + " is rush hour/- " + amRushHour);
		
	}
	

}
