import java.lang.*;

public class FoodItem{
	double price;
	String name;
	
	public FoodItem(){System.out.println("Empty FoodItem");}
	public FoodItem(double price,String name){
		this.price = price;
		this.name = name;
		System.out.println("Para FoodItem");
	}
	
	public void showDetails(){
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
	}
}