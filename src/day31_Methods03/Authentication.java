package day31_Methods03;

public class Authentication {
	public static void main(String[] args) { //call main method, mostly called at the end of code
		login("MENTORING@cybertekschool.com","mentor001");
		login("MENTORING@cybertekschool.com","mentor001");
	}
	/*Name :login
	 * Return type:void
	 * 2string args/params: username,password
	 * inside the method:
	 * valid username = "mentoring@cybertekschool.com"
	 * valid password = "mentor001"
	 * 
	 * if username and password match, print"Login Susccesfull! Welcome to Okta"
	 * if not: "Sign in failed!"
	 */
public static void login(String userName,String password) {    // if you have 2 variables declare variables separatly
	String validUSername = "mentoring@cybertekschool.com";
	String validPassword=	"mentor001";	
	if(userName.equalsIgnoreCase(validUSername) && password.contentEquals(validPassword)) {
		System.out.println("Login succesfull,Welcomer to Okta!");
	}else {
		System.out.println("Sign in failed!");
		
	}
}

}
