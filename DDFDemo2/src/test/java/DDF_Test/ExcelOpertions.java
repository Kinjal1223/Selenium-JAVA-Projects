package DDF_Test;

import java.io.IOException;

import DDF_Test_Utility.Xls_Reader1;

public class ExcelOpertions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Xls_Reader1 reader = new Xls_Reader1("D:\\Eclips\\Selenium_Practice_Projects\\src\\DDF_Test_Data\\DataforRegistration.xlsx");
		
		if(!reader.isSheetExist("HomePage"))
		{
			reader.addSheet("HomePage"); //Add new sheet with name "Home"
		}
		else
		{
			System.out.println("No file");
		}
		
		//count total columns in "Facebook_Regstration" sheet
		int columns = reader.getColumnCount("Facebook_Regstration");
		System.out.println(columns);
		
		//written cell number for kinjal 
		System.out.println(reader.getCellRowNum("Facebook_Regstration", "First_Name", "Kinjal"));
		
	}

}
