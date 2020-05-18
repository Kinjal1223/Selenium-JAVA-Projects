package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(5);
		alist.add(9);
		alist.add(3);
		alist.add(6);
		
		//Iterator & iterator()
		
		 Iterator itr = alist.iterator();
		 
		 while (itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}

}
