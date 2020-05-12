package classes;

public class Appetiziers extends FoodItem{

	private String size;

	public void showInfo(){
		System.out.println("*************************************************");
		System.out.println("\tFood Id: "+getFid());
		System.out.println("\tFood Name: "+getName());
		System.out.println("\ttAvailable Quantity: "+getAvailableQuantity());
		System.out.println("\ttFood Price: "+getPrice());
		System.out.println("\ttAppetizier Size: "+size);
		System.out.println("*************************************************");
		System.out.println();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}