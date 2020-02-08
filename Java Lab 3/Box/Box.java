import java.lang.*;

public class Box{
	private double length;
	private double width;
	private double height;
	
	public static void main(String []args){
		System.out.println("Working");
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
	
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
}