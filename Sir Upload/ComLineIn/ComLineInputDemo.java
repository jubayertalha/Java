import java.lang.*;

public class ComLineInputDemo
{
	public static void main(String []a)
	{
		int i = Integer.parseInt(a[0]);
		String s = a[1];
		double d = Double.parseDouble(a[2]);
		
		Account a1 = new Account(i, s, d);
		a1.showDetails();
		
		System.out.println(a[0] + a[2]);
		System.out.println(i + d);
		
		System.out.println("Hello: "+ i + d);
		System.out.println("Hello: "+ (i + d));
		
		System.out.println(i+d+ "Hello");
	}
}