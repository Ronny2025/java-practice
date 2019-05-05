package day02_Exercises;
import java.util.*;
public class VSmartCode {
	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
    double tip = 0, tipPer=0, perPerson=0;
boolean split;
    String answer="yes";
    
        
    System.out.println("Split:");

    answer=scan.next();
    if (answer.equalsIgnoreCase("yes")) {split=true;}else
        if(answer.equalsIgnoreCase("no")) {split=false;}
    
    
    System.out.println("Number of people  :");
    int people=scan.nextInt();

    
    System.out.println("Check amount:");
    double totalPay=scan.nextDouble();
    
    
    System.out.println("Service Quality:");
    String quality=scan.next();
    

    
       if (quality.equalsIgnoreCase("poor")) {tip=totalPay*0.05;}else
           if (quality.equalsIgnoreCase("fair")) { tip=totalPay*0.1;}else
               if (quality.equalsIgnoreCase("good")) {tip=totalPay*0.15;}else
                   if (quality.equalsIgnoreCase("great")) { tip=totalPay*0.2;}else
                       if (quality.equalsIgnoreCase("excellent")) { tip=totalPay*0.25;}
  
       if(answer.equalsIgnoreCase("yes"))            {
       if (people==1) { perPerson=totalPay+tip;}else
           if (people==2) {perPerson=(totalPay+tip)/2;}else
               if (people==3) {perPerson=(totalPay+tip)/3;}else
                   if (people==4) {perPerson=(totalPay+tip)/4;}else
                       if (people==5) {perPerson=(totalPay+tip)/5;}else
                           if (people==6) {perPerson=(totalPay+tip)/6;}else
                               if (people==7) {perPerson=(totalPay+tip)/7;}else
                                   if (people==8) {perPerson=(totalPay+tip)/8;}else
                                       if (people==9) {perPerson=(totalPay+tip)/9;}else
                                           if (people==10) {perPerson=(totalPay+tip)/10;}else
                                               if (people>10) {perPerson=(totalPay+tip)/10;}else
                                                   if (people==0) {perPerson=totalPay;}
                                                                   }else {perPerson=totalPay+tip;}
       
       
       
       
       
       
       if (answer.equalsIgnoreCase("yes")) {
       
       switch(people) {
       
       case 1:  tipPer=tip;
       break;
       
       case 2: tipPer=tip/2;
       break;
       
       case 3: tipPer=tip/3;
       break;
       
       case 4: tipPer=tip/4;
       break;
       
    case 5: tipPer=tip/5;
       break;
       
    case 6: tipPer=tip/6;
       break;
       
    case 7: tipPer=tip/7;
       break;
       
    case 8: tipPer=tip/8;
       break;
       
    case 9: tipPer=tip/9;
       break;
       
    case 10: tipPer=tip/10;
       break;
       
    case 0: tipPer=tip/1;
       break;
       
       default: tipPer=tip/10;
  
       }
       }
       
switch (people) {
    
    case 0:System.out.println("Number of people entered: &");
    break;
    case 1:System.out.println("Number of people entered: &");
    break;
    case 2:System.out.println("Number of people entered: &&");
    break;
    case 3:System.out.println("Number of people entered: &&&");
    break;
    case 4:System.out.println("Number of people entered: &&&&");
    break;
    case 5:System.out.println("Number of people entered: &&&&&");
    break;
    case 6:System.out.println("Number of people entered: &&&&&&");
    break;
    case 7:System.out.println("Number of people entered: &&&&&&&");
    break;
    case 8:System.out.println("Number of people entered: &&&&&&&&");
    break;
    case 9:System.out.println("Number of people entered: &&&&&&&&&");
    break;
    case 10:System.out.println("Number of people entered: &&&&&&&&&&");
    break;
    
    default: System.out.println("Number of people entered: &&&&&&&&&&");
    }


System.out.println("Total to pay: "+(totalPay+tip));
System.out.println("Total tip: "+tip);

       
System.out.println("Total per person: "+perPerson);
                       
       System.out.println("Tip per person: "+ tipPer);

}
}