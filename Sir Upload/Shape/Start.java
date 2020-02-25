import java.lang.*;

public class Start
{
	public static void main(String arg[])
	{
		Rectangle r1 = new Rectangle();
		r1.setX(12.5);
		r1.setY(10.3);
		
		System.out.println("R1 L: "+r1.getX());
		System.out.println("R1 W: "+r1.getY());
		System.out.println("R1 A: "+r1.getArea());
		System.out.println();
		
		Rectangle r2 = new Rectangle(11.1, 9.9);
		
		System.out.println("R2 L: "+r2.getX());
		System.out.println("R2 W: "+r2.getY());
		System.out.println("R2 A: "+r2.getArea());
		System.out.println();
		
		Triangle t1 = new Triangle();
		t1.setX(12.5);
		t1.setY(10.3);
		
		System.out.println("T1 B: "+t1.getX());
		System.out.println("T1 H: "+t1.getY());
		System.out.println("T1 A: "+t1.getArea());
		System.out.println();
		
		Triangle t2 = new Triangle(11.1, 9.9);
		
		System.out.println("T2 B: "+t2.getX());
		System.out.println("T2 H: "+t2.getY());
		System.out.println("T2 A: "+t2.getArea());
		System.out.println();
	}
}