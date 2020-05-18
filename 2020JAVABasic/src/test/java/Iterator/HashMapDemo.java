package Iterator;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> hmap= new HashMap<Integer,String>();
		
		hmap.put(101,"Kinjal");
		hmap.put(102,"Ashish");
		hmap.put(103,"Uttara");
		
		System.out.println(hmap.get(103)); //Uttara
		System.out.println(hmap.get(102)); //Ashish
		System.out.println(hmap.get(101)); //Kinjal
		
		System.out.println("Below Output using for loop");
		
		for(Integer temp:hmap.keySet())
		{
			System.out.println(temp);
		}
		
		System.out.println("Seconf for loop Output");

		
		for(Integer temp:hmap.keySet())
		{
			System.out.println(hmap.get(temp));
		}
	}

}
