import java.lang.*;

public class Main{
	public static void main(String args[]){
		Product p1,p2;
		
		p1 = new Product();
		p1.setProductId("153AH35");
		p1.setProductName("Nokia 7+");
		p1.setPrice(33000.50);
		p1.setAvailableQuantity(10);
		System.out.println("Product Id : "+p1.getProductId());
		System.out.println("Product Name : "+p1.getProductName());
		System.out.println("Price : "+p1.getPrice());
		System.out.println("Available Quantity : "+p1.getAvailableQuantity());
		
		p2 = new Product("15TB4","Nokia 8",64000.25,4);
		p2.showDetails();
	}
}