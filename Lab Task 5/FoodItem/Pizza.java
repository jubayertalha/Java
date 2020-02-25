import java.lang.*;

public class Pizza extends FoodItem{
	private String size;
	
	public Pizza(){System.out.println("Empty Pizza");}
	public Pizza(String size,double price,String name){
		super(price,name);
		this.size = size;
		System.out.println("Para Pizza\n");
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("Size: "+size+"\n");
	}
}