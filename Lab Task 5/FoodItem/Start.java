import java.lang.*;

public class Start{
	public static void main(String args[]){
		Burger b = new Burger(3,275.5,"Peri-Peri Burger");
		Pizza p = new Pizza("12 inch",850.75,"Naga Pizza");
		
		b.showDetails();
		p.showDetails();
	}
}