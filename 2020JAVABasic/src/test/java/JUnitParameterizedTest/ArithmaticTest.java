package JUnitParameterizedTest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmaticTest {
	
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private Arithmatic arithmatic;
	
	//a constructor that stores the test data
	public ArithmaticTest(int firstNumber, int secondNumber, int expectedResult)
	{
		super();
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
		this.expectedResult=expectedResult;
	}
	
	//The @Before annotation is used here to run before each test case. It contains precondition of the test.
	@Before
	public void setUp()
	{
		arithmatic = new Arithmatic();
	}
	
	// static method that generates and returns test data.
	@Parameterized.Parameters
	public static Collection input()
	{
		// Using asList method we convert the data into a List type. Since, the return type of method input is collection.
		//these array values pass to the constructor
		return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},{111,222,333},{10,9,19}});	
	}
	
	@Test
	public void testArithmatictest()
	{
		System.out.println("Sum of numbers: " +expectedResult);
		int ActualResult = arithmatic.sum(firstNumber , secondNumber);
		Assert.assertEquals(expectedResult, ActualResult);
	}

}





