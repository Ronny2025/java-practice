package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		
		int temperature = 65;
		
		if(temperature >= 65) {
			System.out.println("It is a nice day! Lets code java");
		}else{
			System.out.println("Stay home and code java");
			
			//2 int variables, teamAscore, teambScore
			//put a condition. check if teamA won.
			  //"Team A won".
			//Go team A!
			//else "team b won or it was a draw"
			//Go Teams!
		
			int teamAscore = 10;
			
			int teamBscore = 4;
			
			if (teamAscore > teamBscore) {
				System.out.println("team A Won!");
				System.out.println("Go team A!");
			}else{
				System.out.println("Team B won or it was a draw");
				System.out.println("Go Teams!");
			}
			
		}
		
	}
}


