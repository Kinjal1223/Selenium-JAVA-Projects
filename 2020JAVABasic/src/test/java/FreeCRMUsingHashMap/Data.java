package FreeCRMUsingHashMap;

import java.util.HashMap;

public class Data {
	
	
	public static HashMap<String, String> getUserLoginInfo()
	{
		HashMap<String , String> userMap = new HashMap<String , String>();
		
		userMap.put("Customer", "Cust1_Kia1223");
		userMap.put("Admin", "admin_kia1223");
		userMap.put("apatel", "apatel_Pulsure");
		
		return userMap;	
	}
	
	public static HashMap<Integer, String> monthMap()
	{
		HashMap<Integer , String> monthMap = new HashMap<Integer , String>();
		
		monthMap.put(1, "January");
		monthMap.put(2, "February");
		monthMap.put(3, "March");
		monthMap.put(4, "April");
		monthMap.put(5, "May");
		monthMap.put(6, "June");
		monthMap.put(7, "July");
		monthMap.put(8, "August");
		monthMap.put(9, "September");
		monthMap.put(10, "October");
		monthMap.put(11, "November");
		monthMap.put(12, "December");
		
		return monthMap;
	}
}
