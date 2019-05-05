package day04_primitive_operators;

public class AgeCaculator {
	public static void main(String[] args) {
		int yearOfBirth = 1978, currentYear= 2019, age ;
		age = currentYear - yearOfBirth;
		System.out.println( currentYear - yearOfBirth);
		System.out.println("if you are born in " + yearOfBirth + " then you are " + age +" years old");
				
		int yearOfManufactured = 1980; currentYear = 2020; age = currentYear  - yearOfManufactured;	
		System.out.println(currentYear - yearOfManufactured);
		System.out.println("if product was made in " + yearOfManufactured + " then it is " + age + " years old");
		
		
			int independence = 1821, conquered = 1521; 
			int underColony = independence - conquered;
		System.out.println(underColony); 
		System.out.println("if Peru got its freedon in " + independence + " then it has been independent for " + underColony + " years" );
		int endWar = 1944,  startOfWar = 1939,   lasted = endWar - startOfWar;
		
		System.out.println("if WWII started in " + startOfWar + " then it lasted " + lasted + " years");
		
	}	
}

