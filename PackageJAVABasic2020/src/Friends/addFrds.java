package Friends;

import loginPack.login;

public class addFrds extends login {
	
	public void addFriends()
	{
		login ln=new login();
		
		ln.password="qwe123";
		ln.uname="Ashish";
		
		ln.loginHere();
		
		love="Ashish"; // protected access by inheritance
		
		
	}

}
