package Login;

public class Login {

	public String username;
	public String password;
	
	public static void loginMethod()
	{
		
	}
	
	public void loginandlogout()
	{
		Logout l=new Logout();
		
		l.sessionTime=30;
		
		l.logoutHere();
	}

}
