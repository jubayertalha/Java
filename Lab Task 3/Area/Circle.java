import java.lang.*;

public class Circle{
	private double radius;
	
	public Circle(){
		System.out.println("Circle Empty Constructor");
	}
	
	public double getArea(){
		return 3.1416*getRadius()*getRadius();
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
}