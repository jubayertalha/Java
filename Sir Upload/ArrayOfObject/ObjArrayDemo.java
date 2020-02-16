import java.lang.*;

public class ObjArrayDemo
{
	public static void main(String []args)
	{
		Box []boxes = new Box [4];
		
		Box b1 = new Box();
		b1.setLength(1.2);
		b1.setWidth(1.3);
		b1.setHeight(1.5);
		
		boxes[0] = b1;
		
		Box b2 = new Box();
		
		boxes[1] = b2;
		
		boxes[3] = new Box();
		
		
		
		boxes[1].setLength(2.1);
		boxes[1].setWidth(2.3);
		b2.setHeight(2.5);
		
		boxes[3].setLength(3.2);
		boxes[3].setWidth(3.4);
		boxes[3].setHeight(3.1);
		
		for(int i=0; i<boxes.length; i++)
		{
			if(boxes[i] != null)
			{
				System.out.println("boxes["+i+"] Length: "+boxes[i].getLength());
				System.out.println("boxes["+i+"] Width: "+boxes[i].getWidth());
				System.out.println("boxes["+i+"] Height: "+boxes[i].getHeight());
				System.out.println();
			}
			else
			{
				System.out.println("There is null in boxes["+i+"]");
				System.out.println();
			}
		}
		
		System.out.println("---------------");
		
		for(Box b : boxes)
		{
			if(b != null)
			{
				System.out.println(b.getLength());
				System.out.println(b.getWidth());
				System.out.println(b.getHeight());
				System.out.println();
			}
			else
			{
				System.out.println("There is Null Somewhere");
			}
		}
		
		
	}
}



