import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class ReadData {

	public static void main(String[] args) throws Exception  {
		
		java.io.File file = new java.io.File("\\Eclips\\Nidhi Project\\names_raw.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			String firname = sc.next();
			String lasname = sc.next();
			
			System.out.println(firname + " " +lasname );
		}
		
		//firstnames.txt
		
		String fname = "\\Eclips\\Nidhi Project\\firstname.txt";
		File firstname = new File(fname);
		if (!firstname.exists())firstname.createNewFile();

		Scanner sc1 = new Scanner(file);
		PrintWriter printwriter = new PrintWriter(firstname);

		while (sc1.hasNextLine())
		{
			String firstName = sc1.nextLine();
			int space = firstName.indexOf(" ");
			String name = firstName.substring(0, space);
			printwriter.println(name);
		}

			sc1.close();
			printwriter.close();
				
			System.out.println(" FIRST NAMES:");
			Scanner fn = new Scanner(firstname);
			while(fn.hasNextLine())
			System.out.println(fn.nextLine());
			fn.close();
				
				
		//lastnames.txt
			
		String lname = "\\Eclips\\Nidhi Project\\lastname.txt";
		
		File lastname = new File(lname);
		
		if (!lastname.exists()) lastname.createNewFile();

		Scanner sc2 = new Scanner(file);
		PrintWriter pw = new PrintWriter(lastname);

		while (sc2.hasNextLine()) {
			
			String lastName = sc2.nextLine();
			int space = lastName.indexOf(" ");
			String name2 = lastName.substring(space+1);
			pw.println(name2);
		}

			sc2.close();
			pw.close();
				
			System.out.println("\n LAST NAMES:");
			Scanner ln = new Scanner(lastname);
			while(ln.hasNextLine())
			System.out.println(ln.nextLine());
			ln.close();
				
	}

	}


