package day29_Mlti_Arrays;

import java.util.Arrays;

public class CountriesCities {
public static void main(String[] args) {

	//USA	Washington DC
	//Canada	Ottawa
	//Mexico	Mexico city
	//Brasil	Brasilia
	//Peru	Lima
	//Argentina	Boanes Aeros
	//Bolivia	La Paz
	//Macedonia	Scopia
	//Kazakhstan	Nursultan
	
	String[][]countriesArray = { {"USA",	"Washington DC"},
			                   {"Canada",	"Ottawa"},
			                   {"Mexico",	"Mexico city"},
			                   {"Brasil",	"Brasilia"},
			                   {"Peru",	"Lima"},
			                   {"Argentina",	"Boanes Aeros"},
			                   {"Bolivia",	"La Paz"},
			                   {"Macedonia",	"Scopia"},
			                	   { "Kazakhstan",	"Nursultan"}};
		//String[] [] c =new String[9][2];
		//c[0][0] ="USA"; c[0][1]="Washington DC";
		//print USA with Capital city	                	   
			            System.out.println(countriesArray[0][0] +"|"+countriesArray[0][1] );
			            System.out.println(countriesArray[8][0] +"|"+countriesArray[8][1] );
			            System.out.println(Arrays.deepToString(countriesArray));
			            
			            //print all the countries separated by|
			            
			            //1)for loop
			            
			            for(int i =0; i< countriesArray.length;i++) {
			            	System.out.println(countriesArray[i][0] +"|");
			            
	
			            }	                	   
	                	  for(String[]country :countriesArray) {
		                 System.out.print(country[0] + "|");
	                	  }      
	                	  //get all the cities and add to cities [] array
	                	  
	                String[]cities=new String[countriesArray.length];
	                //null means no object. It is not same as empty String
	                System.out.println(Arrays.toString(cities));
	                
	                	  for(int i = 0; i<countriesArray.length;i++) {
	                	  }	  
	                	  System.out.println(Arrays.deepToString(cities));
	                	  
	                	  
	                	  
	                	  //look for Bolivia in the countries Arr and test if 
	                	  //capital city is "la paz"
	                	  
	                	 
	                	  for(int row =0; row<countriesArray.length; row++ ) {
	                		  if(countriesArray[row][0].contentEquals("Peru")) {
	                			  //System.out.println(countriesArray[row][1]);
	                			  if(countriesArray[row][1].contentEquals("Lima")) {
	                				  System.out.println(" test passed");
	                			  }else {
	                				  System.out.println("test failed");
	                			  }
	                			  break; //exit the loop.
	                		  }
	                	  }
}
}
