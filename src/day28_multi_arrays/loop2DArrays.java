package day28_multi_arrays;

import java.util.Arrays;

public class loop2DArrays {
public static void main(String[] args) {
	
	String[][] pizzas = {
			{"pineapples","pepperoni"},
			{"anchovies","mushroom","olive"},
		    {"4 cheese"},
				{"chicken","tomatoes","jalapanios","onions"},
				{"green", "peppers","zuccini","brocolli","spinach","shrimp"}
			};
	
	
	      //System.out.println(Arrays.toString(pizzas[0]));
	
	for(String[]pizza :pizzas ) {
		System.out.println(pizza.length+"-");
		System.out.println(Arrays.toString(pizza));
		
	}
	System.out.println("#################FOR LOOP##################");
	for (int i = 0; i <pizzas.length;i++){
		System.out.print(pizzas[i].length +"-");
		System.out.println(Arrays.toString(pizzas[i]));
		
		for( String topping:pizzas[2]) {
			System.out.println(topping);
		}
		
		int[][] students = {{4,5,6},
				{12,5,7,},
				{23,56,12,55,3}
		};
		
		//2 pasrts : outer loop , inner loop
		//outer loop will take each group
		//inner loop will take each values/ student id
		for (int []group:students) {
			for(int studentId : group) {
				System.out.print(studentId +",");
			}
			
			System.out.println();
		}
		
		
		int[][] nums = {
                {10, 20},               //0
                {20, 30, 40, 50},       //1
                {100, 200, 400},        //2
                {555,333,111,444,666,78}//3
                 };
	
       for(int m = 0;m < nums.length; m++) {
       for(int j = 0; j < nums[m].length; j++) {
         System.out.print(nums[m][j]+" ");
     }
     System.out.println();
        }
		
	}
	{
		
	}
}

}



