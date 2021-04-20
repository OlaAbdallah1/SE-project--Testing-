package sw.test;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw.main.*;

public class LoginT {
	public static String user;
	public static String pass;
	private int t;
	private Admin l=new Admin(user, pass);
	
	
	@Given("admin want to log in with user name {string} and pass {string}")
	public void admin_want_to_log_in_with_user_name_and_pass(String s1, String s2) {
		this.user=s1;
		this.pass=s2;
		
	}
	
	@When("logged in")
	public void logged_in() {
		t=l.check(user, pass);
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		assertEquals(1,t);
		System.out.println("Logged in is successfully ");
	}
	

	@Given("admin want to log in with wrong password {string} and pass {string}")
	public void admin_want_to_log_in_with_wrong_password_and_pass(String s1, String s2) {
		this.user=s1;
		this.pass=s2;
		
	}


	@Then("Message displayed Login UnSuccessfully")
	public void message_displayed_login_un_successfully() {
		assertEquals(0,t);
		System.out.println("Logged in is Unsuccessfully ");
	}

}

