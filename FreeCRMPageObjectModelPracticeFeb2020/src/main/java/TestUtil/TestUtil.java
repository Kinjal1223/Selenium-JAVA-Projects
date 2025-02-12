package TestUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openxml4j.exceptions.InvalidFormatException;

import Base.TestBase;

public class TestUtil extends TestBase {
	
	//common menthod for all class
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT =30;
	
	public static String TESTDATA_SHEET_PATH = "C:\\Eclips\\FreeCRMPageObjectModelPracticeFeb2020\\src\\main\\java\\TestData\\CRMDealData.xlsx";
	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;
	static String path;

	
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
	
	//Below Code Copy-Paste
	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
		FileInputStream file = null; 
		try 
		{
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try
		{
			book = WorkbookFactory.create(file);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//String currentDir = System.getProperty("user.dir");
        path = "./screenshots/" + scrFile.getName();

		FileUtils.copyFile(scrFile, new File(path + System.currentTimeMillis() + ".png"));
		
		}



}
