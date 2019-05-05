package day15_string_manipulation;

public class GoolgeSearchTest {
	public static void main( String[] args) {
		String item = "java";
		String pageTitle = item + " - Google Search";
		//test if pageTitle starts with item
		
		if(pageTitle.startsWith(item)) {
			System.out.println("PASS: page title check passed");
		}else {
			System.out.println("FAIL: Page title check faied");
		}
		
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Google search is not in title");
		}else {
			System.out.println("FAIL:Googel sarch is not in title");
		}
		
		}

}
