import java.lang.*;

public class StringDemo
{
	public static void main(String arg[])
	{
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.charAt(2));
		
		if(s1 == s2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
		if(s1.equals(s2))
		{
			System.out.println("3");
		}
		else
		{
			System.out.println("4");
		}
		if(s1 == s3)
		{
			System.out.println("5");
		}
		else
		{
			System.out.println("6");
		}
		if(s1.equals(s3))
		{
			System.out.println("7");
		}
		else
		{
			System.out.println("8");
		}
		if(s3 == s4)
		{
			System.out.println("9");
		}
		else
		{
			System.out.println("10");
		}
		if(s3.equals(s4))
		{
			System.out.println("11");
		}
		else
		{
			System.out.println("12");
		}
		
		s3 = "OOP1";
		
		String s5 = s1 + s3;
		System.out.println(s5);
		s1.concat(s3);
		System.out.println(s3);
		
		System.out.println(s5.substring(2,5));
		
		s5.toUpperCase();
		System.out.println(s5);
		
		s5 = s5.toUpperCase();
		System.out.println(s5);
		
		
	}
}