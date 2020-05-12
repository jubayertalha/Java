import java.lang.*;
import java.io.*;
public class FileReaderDemo
{
	public static void main(String []args) throws Exception
	{
		String temp; 
		String a="";
		
		File file = new File("Hello.txt");
		FileReader reader = new FileReader(file);
		
		BufferedReader bfr = new BufferedReader(reader);
		
		
		while((temp=bfr.readLine())!=null)
		{
			a=a+temp+"\n"+"\r";
		}
		
		System.out.print(a);   
		reader.close();
	}
}