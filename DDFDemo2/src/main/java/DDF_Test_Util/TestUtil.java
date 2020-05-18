//Part3
package DDF_Test_Util;
import java.util.ArrayList;

import DDF_Test_Utility.Xls_Reader1;

public class TestUtil {
	
	static Xls_Reader1 reader;

	public static ArrayList<Object[]> getDataFromExcel()
	{

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try
		{
			reader = new Xls_Reader1("D:\\Eclips\\Selenium_Practice_Projects\\src\\DDF_Test_Data\\DataforRegistration.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("Facebook_Regstration"); rowNum++)
		{
			String firstname = reader.getCellData("Facebook_Regstration", "First_Name", rowNum);
			String lastname = reader.getCellData("Facebook_Regstration", "Last_Name", rowNum);
			String email = reader.getCellData("Facebook_Regstration", "Email", rowNum);
			String password = reader.getCellData("Facebook_Regstration", "New_Password", rowNum);
			String reenter = reader.getCellData("Facebook_Regstration", "Re-enter_Password", rowNum);
			
			Object obj[] = {firstname,lastname,email,password,reenter};
			
			myData.add(obj);
					
		}
		return myData;
				
			
	}

}
