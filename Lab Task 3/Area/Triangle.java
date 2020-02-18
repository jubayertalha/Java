import java.lang.*;

public class Triangle{
	private double height;
	private double base;
	
	public Triangle(){
		System.out.println("Triangle Empty Constructor");
	}
	
	public double getArea(){
		return 0.5*getBase()*getHeight();
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	public double getBase(){
		return base;
	}
}