package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert1 {

	@Test
	public void test1()
	{
		SoftAssert sa= new SoftAssert();
		sa.assertTrue(2<1);
		System.out.println("Assertion Failed");
		
		sa.assertFalse(1<2);
		System.out.println("Assertion Failed");
		
		sa.assertEquals("Sample", "Failed");
		System.out.println("Assertion Failed");
		sa.assertAll();
    }
	@Test
	public void test2()
	{
		System.out.println("**********************************");

		SoftAssert sa= new SoftAssert();
		sa.assertTrue(2<3);
		System.out.println("Assertion Passed");
		
		sa.assertFalse(1<2);
		System.out.println("Assertion Failed");
		
		sa.assertEquals("Sample", "Failed");
		System.out.println("Assertion Failed");
		sa.assertAll();
  }
	
}
