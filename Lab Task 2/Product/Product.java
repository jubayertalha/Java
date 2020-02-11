import java.lang.*;

public class Product{
	private String productId;
	private String productName;
	private double price;
	private int availableQuantity;
	
	public Product(){
		//Empty constructor
		System.out.println("\nEmpty Construstor\n");
	}
	
	public Product(String productId,String productName,double price,int availableQuantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	
	public void showDetails(){
		System.out.println("\nProduct Id : "+getProductId());
		System.out.println("Product Name : "+getProductName());
		System.out.println("Price : "+getPrice());
		System.out.println("Available Quantity : "+getAvailableQuantity());
	}
	
	public void setProductId(String productId){
		this.productId = productId;
	}
	public String getProductId(){
		return productId;
	}
	
	public void setProductName(String productName){
		this.productName = productName;
	}
	public String getProductName(){
		return productName;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity = availableQuantity;
	}
	public int getAvailableQuantity(){
		return availableQuantity;
	}
}
	