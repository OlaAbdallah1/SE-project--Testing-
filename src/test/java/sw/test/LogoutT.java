package sw.test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sw.main.*;

public class LogoutT {
	private Admin l=new Admin(LoginT.user,LoginT.pass);
	int c,lo;
	private Admin a;
	protected List <Admin> usersT = new ArrayList<>();
	
	@Given("admin with {string} and {string} want to log out")
	public void admin_want_to_log_out(String user,String pass) {
		lo = l.check(user, pass);
		if(lo==1) {
			System.out.println(user + " You Can logout");
			a=new Admin(user, pass);
			usersT.remove(a);
		}
		else {
			System.out.println(user+" you have to log in first! ");
	}
		}


	@When("logged out")
	public void logged_out() {
		c=l.checkifLogout(LoginT.user, LoginT.pass);
	}

	@Then("Message displayed LogOut!")
	public void message_displayed_log_out() {
		assertEquals(1, c);
		if(lo==1) {
			System.out.println("Logged Out ! ");	
		}
		
	}

}