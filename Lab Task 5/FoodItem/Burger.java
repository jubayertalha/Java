import java.lang.*;

public class Burger extends FoodItem{
	private int numberOfPatties;
	
	public Burger(){System.out.println("Empty Burger");}
	public Burger(int numberOfPatties,double price,String name){
		super(price,name);
		this.numberOfPatties = numberOfPatties;
		System.out.println("Para Burger\n");
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("Number Of Patties: "+numberOfPatties+"\n");
	}
}