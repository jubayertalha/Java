import java.lang.*;

public abstract class Shape
{
	double x;
	
	public Shape(){
		System.out.println("Empty-Shape");
	}
	public Shape(double x){
		System.out.println("Para-Shape");
		this.x = x;
	}
	public void setX(double x){this.x = x;}
	public double getX(){return x;}
	public abstract double getArea();
}