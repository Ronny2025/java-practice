package day07_scanner_operator;


public class PreAndPost {
	public static void main(String[]args) {
		int num = 0;
			int num2 = num++;
		System.out.println("num: " + num);
		System.out.println("num2: "+ num2);
		
		int n = 20;
		int n2 = ++n;
		System.out.println("num");
		
		
		int bananas = 6; //6
		int apples = ++bananas; //7=> apples7
		int pears = bananas++; //pears -7, bananas -8
		
		System.out.println("bananas: " + bananas);
		
		
		int p1 = 10;
		int sum = p1++ + 5;
		//p1 + and assign to sum
		//p1 = p1 + 1
		
	
		System.out.println("sum: " + sum);
		System.out.println("p1:" + p1);
		
		int batteries = 8;
		int oldBatteries =7;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries);
		System.out.println("oldBatteires: " + batteries);
		System.out.println("totalBatteries:"+ totalBatteries);
		
		
			
		}
		
	}


