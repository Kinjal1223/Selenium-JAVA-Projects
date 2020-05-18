package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@DataProvider(name="abc")
	public Object[][] data()
	{
		return new Object[][] {{5,5}};	
	}
	
	@Test(dataProvider="abc")
	public void calcuate(int a, int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	/*
	@Parameters({"a" , "b"})
	@DataProvider(name="abc")
	public Object[][] data()
	{
		Object b = null;
		Object a=null;
		return new Object[][] {{a,b}};	
	}
	*/

}
