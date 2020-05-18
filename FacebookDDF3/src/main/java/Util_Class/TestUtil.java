package Util_Class;

import java.util.ArrayList;

import Xls_Reader1_File.Xls_Reader1;

public class TestUtil {

	static Xls_Reader1 reader;

	public static ArrayList<Object[]> getDataFromExcel()
	{

	
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try
		{
			reader = new Xls_Reader1("D:\\Eclips\\Selenium_Framework_Project\\Maven_Practice_Project1\\src\\main\\java\\Facebook_Data\\Facebook.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("Facebook_Create_Account"); rowNum++)
		{
			String firstname = reader.getCellData("Facebook_Create_Account", "FirstName", rowNum);
			String lastname = reader.getCellData("Facebook_Create_Account", "LastName", rowNum);
			String email = reader.getCellData("Facebook_Create_Account", "Email", rowNum);
			String password = reader.getCellData("Facebook_Create_Account", "Password", rowNum);
			
			Object obj[] = {firstname,lastname,email,password};
			
			myData.add(obj);
					
		}
		return myData;
			
			
	}

	}

