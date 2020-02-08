import java.lang.*;

public class Box
{
	private double length;
	private double width;
	private double height;
	
	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	
	public static void main(String args[])
	{
		Box b1 = new Box();
		
		b1.setLength(1.2);
		b1.setWidth(1.5);
		b1.setHeight(2.3);
		
		System.out.println("Length is: "+b1.getLength());
		System.out.println("Width is: "+b1.getWidth());
		System.out.println("Height is: "+b1.getHeight());
		
		Box b2 = new Box();
		b2.setLength(2.2);
		b2.setWidth(2.5);
		b2.setHeight(3.2);
		
		System.out.println("Length is: "+b2.getLength());
		System.out.println("Width is: "+b2.getWidth());
		System.out.println("Height is: "+b2.getHeight());
		
	}
}