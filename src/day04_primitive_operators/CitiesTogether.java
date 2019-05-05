package day04_primitive_operators;

public class CitiesTogether {
	public static void main(String[] args) {
	
	
	String city1 = "Tashkent";
	String city2 = "Kyiv";
	String city3 = "Moscow";
	
	// from Tashkent to Kyiv is $500

	System.out.println("From "+city1+" to "+city2 +" is $500");
	System.out.println("From "+city3+" to "+city2 +" is $500");
	System.out.println("From "+city2+" to "+city3 +" is $500");
	
	String app = "Slack";
	//We use<Slack> for messaging with classmates
	
	System.out.println("We use "+app+" for messaging with Classmates");
	
	String country1 = "Ecuador";
	String country2 = "Peru";
    String country3 = "Chile";
    System.out.println("From " + country1 + " to " +  country2 + " there are 3 hours on plane");
    System.out.println("There was not war between " + country3 + " and " + country1);
    
    System.out.println("There were 2 wars between " + country1 +" and " + country2 + " also there was a war between " + country2 + " and " + country3);
	}
	
	
}