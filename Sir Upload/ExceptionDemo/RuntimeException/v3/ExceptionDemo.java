import java.lang.*;
import java.util.*;

public class ExceptionDemo
{
	private int x, y;
	private String s;
	
	public static void main(String args[])
	{
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		ExceptionDemo ed = new ExceptionDemo();
		
		//InputMismatchException or ArithmeticException
		
		try
		{
			System.out.print("Please enter an integer: ");
			ed.x = sc.nextInt();
			System.out.print("Please enter an integer: ");
			ed.y = sc.nextInt();
	
			System.out.println(ed.x+ed.y);
	
			System.out.println(ed.x/ed.y);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Occured");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("InputMismatchExeption Occured");
		}	
		
		
		//NullPointerException or NumberFormatException
		
		
		try
		{
			if(ed.x % 2 == 0)
			{
				System.out.print("Please Enter a String: ");
				ed.s = sc.next();
				int i = Integer.parseInt(ed.s);
				System.out.println("Number is: "+i);
			}
			System.out.println(ed.s.length());
			System.out.println(ed.s.isEmpty());
			
			int a[] = new int[]{10, 20, 30};
		
			for(int i=0; i<=3; i++)
			{
				System.out.println(a[i]);
				System.out.println("try "+ i);
			}
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("NumberFormatException Occured");
		}
		catch(NullPointerException npe)
		{
			System.out.println("NullPointerException Occured");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
		//ArrayIndexOutOfBoundsException
		/*
		int a[] = new int[]{10, 20, 30};
		
		for(int i=0; i<=3; i++)
		{
			try
			{
				System.out.println(a[i]);
				System.out.println("try "+ i);
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println("ArrayIndexOutOfBoundsException Occured"+i);
			}
		}
		*/
		System.out.println("End");
	}
}
