import java.lang.*;
public class FinalDemo
{
	private final int x = 300;
	
	public FinalDemo(){/*x = 100;*/}
	public FinalDemo(int x){
		//this();
		//this.x = x;
	}
	
	//public void setX(int x){ this.x = x; }
	public int getX(){return x;}
}