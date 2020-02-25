import java.lang.*;

public class Start{
	public static void main(String arg[]){
		Rectangle r1 = new Rectangle();
		
		r1.setX(1.1);
		r1.setY(2.1);
		
		System.out.println("R1 X : "+r1.getX());
		System.out.println("R1 Y : "+r1.getY());
		System.out.println("R1 Area : "+r1.getArea()+"\n");
		
		Rectangle r2 = new Rectangle(1.2,2.2);
		
		System.out.println("R2 X : "+r2.getX());
		System.out.println("R2 Y : "+r2.getY());
		System.out.println("R2 Area : "+r2.getArea()+"\n");
		
		Triangle t1 = new Triangle();
		
		t1.setX(1.1);
		t1.setY(2.1);
		
		System.out.println("T1 X : "+t1.getX());
		System.out.println("T1 Y : "+t1.getY());
		System.out.println("T1 Area : "+t1.getArea()+"\n");
		
		Triangle t2 = new Triangle(1.2,2.2);
		
		System.out.println("T2 X : "+t2.getX());
		System.out.println("T2 Y : "+t2.getY());
		System.out.println("T2 Area : "+t2.getArea()+"\n");
		
		Circle c1 = new Circle();
		
		c1.setX(1.1);
		
		System.out.println("C1 X : "+c1.getX());
		System.out.println("C1 Area : "+c1.getArea()+"\n");
		
		Circle c2 = new Circle(1.2);
		
		System.out.println("C2 X : "+c2.getX());
		System.out.println("C2 Area : "+c2.getArea()+"\n");
	}
}