package Test;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterAnnotationTestNG {
	
	/*
	@BeforeGroups("one-include-method")
	public void first()
	{
		System.out.println("dcnks");
	}
	*/
	
	//Parameter from testng.xml file
	@Parameters({"browser"})
	@BeforeTest
	public void browsername(String browsername)
	{
		System.out.println("This is Test 1 for browser name " + browsername);
	}
	
	@Parameters({"username" , "password"})
	@BeforeTest
	public void login(String uname, String pass)
	{
		System.out.println("Username: "+uname+" Password"+pass);
	}
	
	@Test(groups= {"one-include-method"})
	public void method1()
	{
		System.out.println("This is group one include method");
	}
	
	@Test(groups= {"one-exclude-method"})
	public void method2()
	{
		System.out.println("This is group two exclude method");
	}
	
	@Test(groups= {"one-last-method"})
	public void method3()
	{
		System.out.println("This is group three include/exclude method");
	}
}
