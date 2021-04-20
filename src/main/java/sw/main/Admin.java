package sw.main;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	protected List <Admin> users=new ArrayList <> ();
	static String[] usernames= {"ola","danashami","aya"};
	static String[] passwords= {"123@","456#","789$"};
	private Admin a,b;

	private String username=" ";
	private String password=" ";
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void usersTest() {
		for(int l = 0; l < 3; l++) {
			a=new Admin(usernames[l],passwords[l]);
			users.add(a);	
		}
	}
	public int check(String u1, String p1) {
		usersTest();
		for(int p=0;p<users.size();p++) {
			if (u1.equals(users.get(p).getUsername()) && p1.equals(users.get(p).getPassword())) {
		return 1;
		}	
		}
			return 0;
	}
	public int checkifLogout(String user, String pass) { 
		b=new Admin(user, pass);
		if(!users.contains(b)){
		return 1;
	}
		return 0;
	}
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
}
