package classes;

public class Appetiziers extends FoodItem{

	private String size;

	public void showInfo(){
		System.out.println("*************************************************");
		System.out.println("\tFood Id: "+getFid());
		System.out.println("\tFood Name: "+getName());
		System.out.println("\tAvailable Quantity: "+getAvailableQuantity());
		System.out.println("\tFood Price: "+getPrice());
		System.out.println("\tAppetizier Size: "+size);
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