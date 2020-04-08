import java.lang.*;
import java.io.*;

//readLine()
//method of BufferedReader 
//to create an object of BufferedReader, we need an object of InputStreamReader
//The parameterized cnstructor of InputStreamReader takes System.in as its parameter

public class StringInput
{
	public static void main(String args[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		try
		{
			System.out.print("Please Enter a String: ");
			String s = bfr.readLine();
			System.out.println("You have entered: "+s);
		}
		catch(IOException ioe)
		{
			System.out.println("IOException Occured");
		}
		
		
	}
}