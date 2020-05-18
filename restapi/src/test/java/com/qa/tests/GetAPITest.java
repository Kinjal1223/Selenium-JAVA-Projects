package com.qa.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase{
	
	public GetAPITest() throws FileNotFoundException
	{
		super();
		
	}

	TestBase testbase;
	
	@BeforeMethod()
	public void setUP() throws ClientProtocolException, IOException
	{
		testbase = new TestBase();
		String serviceurl = prop.getProperty("URL");
		String apiURL = prop.getProperty("serviceURL ");
		
		//https://reqres.in/api/users
		String url = serviceurl + apiURL;
		RestClient restClient = new RestClient();
		restClient.get(url);
	}

}
