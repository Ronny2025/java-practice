package day02_Exercises;

public class PracticeArrays041719 {
public static void main(String[] args) {
	int value= 7;
	int[]values;
	values= new int [13];
	System.out.println(values[0]);
	values[0]= 10;
	values[1]=28;
	
	values[2]=37;
	values[3]=39;
	values[4]=45;
	values[5]=342;
	values[6]=31;
	values[7]=33;
	values[8]=395;
	values[9]=391;
	values[10]=390;
	values[11]=382;
	values[12]=340;
	
	
	
	System.out.println(values[0]);
	System.out.println(values[1]);
	System.out.println(values[2]);
	for(int i= 0; i<values.length;i++) {
		System.out.println(values[i]);
	}
}
}
