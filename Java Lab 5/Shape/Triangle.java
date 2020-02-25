import java.lang.*;

public class Triangle extends Shape{
	private double y;
	
	public Triangle(){System.out.println("Empty Triangle");}
	public Triangle(double x,double y){
		super(x);
		this.y = y;
		System.out.println("Para Triangle");
	}
	
	public double getArea(){return 0.5*x*y;}
	
	public void setY(double y){this.y=y;}
	public double getY(){return y;}
}