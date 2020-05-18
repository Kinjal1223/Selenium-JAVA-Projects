package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//GET Method
	public void get(String url) throws ClientProtocolException, IOException
	{
		//will return one closable HttpClient Object
		// CloseableHttpClient is a class
		//httpclient is reference variable 
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
		//It will create one get connection with given URL
		HttpGet get = new HttpGet(url); // http get request
		
		CloseableHttpResponse closeablehttpresponse = httpclient.execute(get); // hit the get url
		
		//getting status code
		int statusCode = closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		
		//getting jason String
		String responseString = EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		JSONObject responsejason = new JSONObject(responseString);
		System.out.println("Response Jason From API " + responsejason);
		
		//getting all headers
		Header[] headerarray = closeablehttpresponse.getAllHeaders();
		
		HashMap<String, String> allHeaders = new HashMap<String,String>();
		
		for(Header header: headerarray)
		{
			allHeaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("Headers Array  "+ allHeaders);
		
	}

}
