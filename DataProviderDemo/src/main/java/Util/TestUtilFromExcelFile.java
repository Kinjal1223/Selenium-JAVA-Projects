package Util;

import java.util.ArrayList;

import Test_Util_xls1File.Xls_Reader1;

	public class TestUtilFromExcelFile {
		
		static Xls_Reader1 reader;

		public static ArrayList<Object[]> getDataFromExcel()
		{

			ArrayList<Object[]> myData = new ArrayList<Object[]>();
			
			try
			{
				reader = new Xls_Reader1("D:\\Eclips\\Selenium_DataProvider_Practice\\src\\main\\java\\TestData\\DataforRegistration.xlsx");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			for(int rowNum = 2; rowNum <= reader.getRowCount("Facebook_Regstration"); rowNum++)
			{
				String firstname = reader.getCellData("Facebook_Regstration", "First_Name", rowNum);
				String email = reader.getCellData("Facebook_Regstration", "Email", rowNum);
				String password = reader.getCellData("Facebook_Regstration", "New_Password", rowNum);
				String reenter = reader.getCellData("Facebook_Regstration", "Re-enter_Password", rowNum);
				
				Object obj[] = {firstname,email,password,reenter};
				
				myData.add(obj);
						
			}
			return myData;
					
				
		}


}
