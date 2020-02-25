import java.lang.*;

public class Rectangle extends Shape
{
	private double y;
	
	public Rectangle(){
		super();
		System.out.println("Empty-Rectangle");
	}
	public Rectangle(double x, double y){
		super(x);
		System.out.println("Para-Rectangle");
		this.y = y;
	}
	public void setY(double y){this.y = y;}
	public double getY(){return y;}
	public double getArea(){return x * y;}
	
}