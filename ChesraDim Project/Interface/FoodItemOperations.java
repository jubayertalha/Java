package Interface;

import Class.*;

public interface FoodItemOperations {
	void insertFoodItem(FoodItem f);

	void removeFoodItem(FoodItem f);

	FoodItem getFoodItem(String fid);

	void showAllFoodItems();
}