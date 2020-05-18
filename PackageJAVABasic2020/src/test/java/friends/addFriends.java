package friends;

import Login.Login;
import Login.Logout;

//import Login.*;

public class addFriends {
	
	int fName;
	
	public void addFriend1()
	{
		Login login=new Login();
		
		login.loginMethod();
		
		login.username="kinjal";
		login.password="abc";
		
		Logout lout=new Logout();
		lout.sessionTime=30;
	}

}
