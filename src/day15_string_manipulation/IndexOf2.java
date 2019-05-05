package day15_string_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		//index of with 2 inputs
		
		String list  = "html-selenium-angular-jenkinns-grid";
		int firstDash = list.indexOf("-");
		System.out.println("First dash:" + firstDash);
		
		int secondDash = list.indexOf("-", 5);//estara buscando desde el segundo dash(5)
		System.out.println("second dash:" + secondDash);
		
		//find the third one by using secodDash variable
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println("third dash: " + thirdDash);
		//find the last dash.
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("last dash: " + lastDash);
	}
	

}
