package Iterator;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorDemo {

	public static void main(String[] args) {

	  //HashSet hset = new HashSet();
	  HashSet<String> hset = new HashSet<String>();
		
		hset.add("My ");
		hset.add("name ");
		hset.add("is ");
		hset.add("Kinjal ");
		
		Iterator itr = hset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
