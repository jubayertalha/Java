import java.lang.*;

public class Square{
	private double side;
	
	public Square(){
		System.out.println("Square Empty Constructor");
	}
	
	public double getArea(){
		return getSide()*getSide();
	}
	
	public void setSide(double side){
		this.side = side;
	}
	public double getSide(){
		return side;
	}
}