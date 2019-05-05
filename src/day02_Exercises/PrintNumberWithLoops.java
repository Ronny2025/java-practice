package day02_Exercises;

public class PrintNumberWithLoops {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
        if (i%2==0) {
            for(char a = 'a'; a <= 'z'; a++) {
                System.out.print(a+" ");
            }
        }else {
            for(char z = 'z'; z >= 'a'; z--) {
                System.out.print(z+" ");
            }
            
        }
        System.out.println();
        for(char z = 'z'; z >= 'a'; z--) {
            System.out.print("**");
        }
        System.out.println();
	}
}
}
