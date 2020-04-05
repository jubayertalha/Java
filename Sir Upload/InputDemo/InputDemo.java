/*

Some of the librarry classes that are required for taking input are, 

Scanner -> java.util.Scanner
InputStream -> java.io.InputStream

InputStreamReader -> java.io.InputStreamReader
BufferedReader -> java.io.BufferedReader


Why did we wrote  System.out.println() for printing anything?

println() method belongs to java.io.PrintStream class.
So, we need an object of PrintStream class to call the println() method.
The System class has a static attribute named 'out' which is of PrintStream type.
This out object of PrintStream class is used to call the println() method of PrintStream class.
and as out is a static attribute, we need to use the name of the class to access it. And that's how we get

System.out.println()

*/

import java.lang.*;
import java.util.*;

public class InputDemo
{
	public static void main(String args[])
	{
		int i;
		double d;
		String s;
		char c;
		
		Scanner sc = new Scanner(System.in);
		
		//nextLine() is a method of Scanner class that is used to take String input.
		//but it has a limitation. It will only work properly if the input is taken before anyother input
		//So, the next block of code will do just fine.
		
		/*
		System.out.print("Please enter a String: ");
		s = sc.nextLine();
		System.out.println("You have Entered: "+ s);
		*/
		
		System.out.print("Please enter an integer: ");
		i = sc.nextInt();								//nextInt() is a method of Scanner class that is used to take integer input.
		System.out.println("You have Entered: "+ i);
		
		System.out.print("Please enter a double: ");
		d = sc.nextDouble();							//nextDouble() is a method of Scanner class that is used to take double input.
		System.out.println("You have Entered: "+ d);


		//next() is a method of Scanner class that is used to take String input.
		//but it also has a limitation. It can only take a word not a sentence.
		
		/*
		System.out.print("Please enter a String: ");
		s = sc.next();
		System.out.println("You have Entered: "+ s);
		*/
		
		System.out.print("Please enter a char: ");
		c = sc.next().charAt(0);						//taking a char input.
		System.out.println("You have Entered: "+ c);
		
	}
}