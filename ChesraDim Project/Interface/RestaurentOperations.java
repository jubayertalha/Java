package Interface;

import Class.*;

public interface RestaurentOperations {
	void insertRestaurant(Restaurant r);

	void removeRestaurant(Restaurant r);

	Restaurant getRestaurant(String rid);

	void showAllRestaurants();
}