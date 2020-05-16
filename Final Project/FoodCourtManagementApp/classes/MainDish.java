package classes;

public class MainDish extends FoodItem{

	private String category;

	public void showInfo(){
		System.out.println("*************************************************");
		System.out.println("\tFood Id: "+getFid());
		System.out.println("\tFood Name: "+getName());
		System.out.println("\tAvailable Quantity: "+getAvailableQuantity());
		System.out.println("\tFood Price: "+getPrice());
		System.out.println("\tDish Category: "+category);
		System.out.println("*************************************************");
		System.out.println();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}