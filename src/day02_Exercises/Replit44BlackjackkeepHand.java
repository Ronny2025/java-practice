package day02_Exercises;
import java.util.*;
public class Replit44BlackjackkeepHand {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
    
		
	
    
    int house = s.nextInt();
    int player = s.nextInt();
    int total = (house + player);
    //your code here
if(total>21){System.out.println("output: bust");
}else if(house> player){System.out.println("output: player loss");
}else if(player == house){System.out.println("output: its a tie");
}else if(player>house){System.out.println("output: player wins");
}
  


  

    
  }
}
