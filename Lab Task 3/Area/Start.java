import java.lang.*;

public class Start{
	public static void main(String args[]){
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();
		Square square = new Square();
		
		rectangle.setLength(1);
		rectangle.setWidth(2);
		
		triangle.setHeight(3);
		triangle.setBase(4);
		
		circle.setRadius(5);
		
		square.setSide(6);
		
		System.out.println("\nRecangle Length : "+rectangle.getLength());
		System.out.println("Rectangle Width : "+rectangle.getWidth());
		System.out.println("Rectangle Area : "+rectangle.getArea()+"\n");
		
		System.out.println("\nTriangle Height : "+triangle.getHeight());
		System.out.println("Triangle Base : "+triangle.getBase());
		System.out.println("Triangle Area : "+triangle.getArea()+"\n");
		
		System.out.println("\nCircle Radius : "+circle.getRadius());
		System.out.println("Circle Area : "+circle.getArea()+"\n");
		
		System.out.println("\nSquare Side : "+square.getSide());
		System.out.println("Square Area : "+square.getArea()+"\n");
	}
}