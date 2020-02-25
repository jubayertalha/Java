import java.lang.*;

public class Rectangle extends Shape{
	private double y;
	
	public Rectangle(){System.out.println("Empty Rectangle");}
	public Rectangle(double x,double y){
		super(x);//multiple super is not allowed
		this.y = y;
		System.out.println("Para Reacangle");
	}
	
	public double getArea(){return x*y;}
	
	public void setY(double y){
		this.y = y;
	}
	public double getY(){
		return y;
	}
}