package day24_Arrays2;

public class Cities {
public static void main(String[] args) {
	String[]cities =  {"Washingtond D.C.", "Kiew", "Annandale","Moscow","Istambul","Baku",
	"Istanbul", "Baku","Miami","Silver Spring", "Mclean"};
	System.out.println(cities.length);
	//task print all cities that start with M
	for(int i=0; i<cities.length; i++ ) {
		if( cities[i].startsWith("M")) {
			System.out.println(cities[i]);
			//System.out.println (i);
			
		}
	}
	
	System.out.println("#########################");
	
	for(String city: cities) {
		if (city.startsWith("M")) {
			System.out.println(city);
		}
	}
	
	
}
}
