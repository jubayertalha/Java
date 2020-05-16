package classes;
import interfaces.*;

public class Restaurant implements FoodItemOperations{

	private String rid;
	private String name;
	private FoodItem foodItems[] = new FoodItem [10];
	
	public void insertFoodItem(FoodItem f){
		boolean isInserted = false;
		if(getFoodItem(f.getFid())==null){
			if(!f.getName().equals("")&&!f.getFid().equals("")){
				if(f.getAvailableQuantity()>=0&&f.getPrice()>=0){
					for(int i=0; i<foodItems.length; i++){
						if(foodItems[i] == null){
							foodItems[i] = f;
							isInserted = true;
							break;
						}
					}
					if(isInserted){
						System.out.println("-------------------------------------------------");
						System.out.println("\t"+"The item has been inserted successfully!");
						System.out.println("-------------------------------------------------");
						System.out.println();
					}else{
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
						System.out.println("\t"+"Sorry.. There is no available space to insert a food item. Please try again!");
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
						System.out.println();
					}
				}else{
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. Inputs can't be negative. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
				}
			}else{
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("\t"+"Sorry.. Inputs can't be empty. Please try again!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println();
			}
		}else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is another FoodItem with this Id. Please try again with another Id!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}
	
	public void removeFoodItem(FoodItem f){
		boolean isRemoved = false;
		for(int i=0; i<foodItems.length; i++){
			if(foodItems[i] == f && f != null){
				foodItems[i] = null;
				isRemoved = true;
				break;
			}
		}
		if(isRemoved){
			System.out.println("-------------------------------------------------");
			System.out.println("\t"+"The item has been removed successfully!");
			System.out.println("-------------------------------------------------");
			System.out.println();
		}
		else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching item to be removed. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}

	public FoodItem getFoodItem(String fid){
		FoodItem f = null;
		for(int i=0; i<foodItems.length; i++){
			if(foodItems[i] != null && foodItems[i].getFid().equals(fid)){
				f = foodItems[i];
				break;
			}
		}
		return f;
	}

	public void showAllFoodItems(){
		boolean isEmpty = true;
		for(FoodItem f : foodItems){
			if(f != null){
				f.showInfo();
				isEmpty = false;
			}
		}
		if(isEmpty){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"There is no FoodItem");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}