import java.lang.*;

public class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(){
		System.out.println("Rectangle Empty Constructor");
	}
	
	public double getArea(){
		return getLength()*getWidth();
	}
	
	public void setLength(double length){
		this.length = length;
	}
	public double getLength(){
		return length;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}
}