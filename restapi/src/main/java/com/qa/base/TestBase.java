package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public static Properties prop;

	public TestBase() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("C:\\Eclips\\restapi\\src\\main\\java\\com\\qa\\config\\config.peoperties");
		prop = new Properties();
		try
		{
			prop.load(fis);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
