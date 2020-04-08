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
		
		//InputMismatchException
		
		try
		{
			System.out.print("Please enter an integer: ");
			ed.x = sc.nextInt();
			System.out.print("Please enter an integer: ");
			ed.y = sc.nextInt();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("InputMismatchExeption Occured");
		}			
		System.out.println(ed.x+ed.y);
		
		
		
		
		//ArithmeticException
		
		
		System.out.print("Please enter an integer: ");
		ed.x = sc.nextInt();
		System.out.print("Please enter an integer: ");
		ed.y = sc.nextInt();
		
		try
		{
			System.out.println(ed.x/ed.y);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Occured");
		}
		
		
		//NullPointerException
		
		
		try
		{
			System.out.println(ed.s.length());
			System.out.println(ed.s.isEmpty());
		}
		catch(NullPointerException npe)
		{
			System.out.println("NullPointerException Occured");
		}
		
		//NumberFormatException
		
		
		System.out.print("Please Enter a String: ");
		ed.s = sc.next();
		try
		{
			int i = Integer.parseInt(ed.s);
			System.out.println("Number is: "+i);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("NumberFormatException Occured");
		}
		
		//ArrayIndexOutOfBoundsException
		
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
		
		System.out.println("End");
	}
}
