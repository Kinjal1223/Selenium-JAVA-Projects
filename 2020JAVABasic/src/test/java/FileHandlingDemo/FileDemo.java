package FileHandlingDemo;
import java.io.*;

public class FileDemo {
	
	public static void main(String args[]) throws IOException
	{
		
		File f1 = new File("D:\\Selenium.docx"); //File outside the project
		
		//File inside the project & folder. Complete or Absolute Path.
		File f2 = new File("C:\\Eclips\\CoreJAVAPrograms\\src\\Hello.txt");  
		
		File f3 = new File("Hello.txt"); // File inside the project
		
		System.out.println(f2.getAbsolutePath());
		System.out.println(f3.getAbsolutePath());
		
		File f4=new File("Sample.txt");
		FileReader fr = new FileReader(f4);
		BufferedReader br = new BufferedReader(fr);
		
		/*
		
		System.out.println(br.readLine()); //Second line will be printed
		System.out.println(br.readLine()); //Third line will be printed
		System.out.println(br.readLine()); //Forth line will be printed
		System.out.println(br.readLine()); //Fifth line will be printed
		System.out.println(br.readLine()); //Sixth line will be printed (Display Null Because there is just 4 line in file)
	
		 OR  */
		 
		 String str;
		 
		 while((str=br.readLine())!=null)
		 {
			 System.out.println(str);
		 }
	}

}
