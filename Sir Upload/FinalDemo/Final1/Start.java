import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		FinalDemo fd1 = new FinalDemo();
	
		System.out.println(fd1.getX());
		
		FinalDemo fd2 = new FinalDemo(200);
	
		System.out.println(fd2.getX());

		
	}
}