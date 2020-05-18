package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo1 {

		public static void main(String[] args) {
			
			//HashMap is a class imlements Map Interface
			//extends AbstractMap
			//It conatins only unique elements
			//Stores values in the form of KEY , VALUE pair
			//It may have one null KEY and multiple null VALUE
			//Maintains no order
			//hashmap used for multi-threading
			//hashmap is non-synchronised means not thread safe: if used in multithreading  means more than one thread can access hashmap parallely
			//hashtable is synchronised means thread safe. hashtable object only access by one thread  at a time 
			/*PRoblem with has hashmap: Fail-Fast Condition. 
			 * When two thread t1, t2 accessing same key-value(1,A). 
			 * if thread t1 change one value to (1,C). 
			 * so, here thead t2 was expecting key-value(1,A) ,
			 *  but it is changes by thread t1. 
			 *  So here concurrent modification exception will be there.
			 *  concurrent modification exception means Fail-Fast Condition
			 *  Whenever calling perticular hashmap, if any modification happening in between by some other thread, 
			 *  then concurrent modition exception occure*/
			
			HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
			
			hashmap.put(1, "Selenium");
			hashmap.put(2, "QTP");
			hashmap.put(3, "TestComplete");
			hashmap.put(4, "JAVA");

			
			System.out.println(hashmap.get(4));
			
			for(Entry m : hashmap.entrySet())
			{
				System.out.println(m.getKey() + " " + m.getValue());
			}
			
			//remove method by KEY
			hashmap.remove(4);
			System.out.println(hashmap);
			
			System.out.println("---------------------------------------------");
			
			HashMap<Integer, Employee> emp = new HashMap<Integer , Employee>();
			
			Employee e1 = new Employee("Kinjal", 29,"Tester");
			Employee e2 = new Employee("Ashish", 34,"Developer");
			Employee e3 = new Employee("Uttara", 29,"Manager");
			
			emp.put(1, e1);
			emp.put(2, e2);
			emp.put(3, e3);
			
			//Entry is interface used to traverse hashmap
			for(Entry<Integer, Employee> m : emp.entrySet())
			{
				int key = m.getKey();
				Employee e = m.getValue();
				System.out.println("Employee " + key + " info");
				System.out.println(e.name + " " +e.age + " " + e.designation + "\n");

			}
			

			
			
		
	}

}
