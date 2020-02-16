import java.lang.*;

public class ArrayDemo
{
	public static void main(String []args)
	{
		int []a = new int [5];
		
		a[0] = 10;
		a[1] = 20;
		a[3] = 30;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("a["+i+"] : "+a[i]);		
		}
		
		for(int value : a)
		{
			System.out.println(value);
		}
		
		int b[];
		
		int x = a[3]/a[0];
		
		b = new int [x];
		
		b[0] = 3;
		b[1] = 5;
		b[2] = 7;
		
		for(int value : b)
		{
			System.out.println(value);
		}
		
		int c[] = new int [] {1,2,3};
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println("c["+i+"] : "+c[i]);		
		}
		
		int d[] = {1,2,3,4};
		int index =0;
		
		while(index<d.length)
		{
			System.out.println(d[index]);
			index++;
		}
	}
}