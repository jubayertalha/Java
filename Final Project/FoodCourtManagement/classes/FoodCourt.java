package classes;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations{

	private Restaurant restaurants[] = new Restaurant[500];
	private Employee employees[] = new Employee[100];
	
	public void insertRestaurant(Restaurant r){
		boolean isInserted = false;
		for(int i=0; i<restaurants.length; i++){
			if(restaurants[i] == null){
				restaurants[i] = r;
				isInserted = true;
				break;
			}
		}
		if(isInserted){
			System.out.println("-------------------------------------------------");
			System.out.println("\t"+"The restaurant has been inserted successfully!");
			System.out.println("-------------------------------------------------");
			System.out.println();
		}else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no available space for a new restaurant. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}
	
	public void removeRestaurant(Restaurant r){
		boolean isRemoved = false;
		for(int i=0; i<restaurants.length; i++){
			if(restaurants[i] == r && r != null){
				restaurants[i] = null;
				isRemoved = true;
				break;
			}
		}
		if(isRemoved){
			System.out.println("-------------------------------------------------");
			System.out.println("\t"+"The restaurant has been removed successfully!");
			System.out.println("-------------------------------------------------");
			System.out.println();
		}
		else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching restaurant to be removed. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}
	
	public Restaurant getRestaurant(String rid){
		Restaurant r = null;
		for(int i=0; i<restaurants.length; i++){
			if(restaurants[i] != null && restaurants[i].getRid().equals(rid)){
				r = restaurants[i];
				break;
				
			}
		}
		return r;
	}
	
	public void showAllRestaurants(){
		for(Restaurant r : restaurants){
			if(r != null){
				System.out.println("#################################################");
				System.out.println("\tRestaurant Name: "+r.getName());
				System.out.println("\tRestaurant Id: "+r.getRid());
				System.out.println("\tFood Items: ");
				r.showAllFoodItems();
				System.out.println("#################################################");
				System.out.println();
			}
		}
	}

	public void insertEmployee(Employee e){
		boolean isInserted = false;
		for(int i=0; i<employees.length; i++){
			if(employees[i] == null){
				employees[i] = e;
				isInserted = true;
				break;
			}
		}
		if(isInserted){
			System.out.println("-------------------------------------------------");
			System.out.println("\t"+"New employee has been appointed successfully!");
			System.out.println("-------------------------------------------------");
			System.out.println();
		}else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no available vacancy for a new employee. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}
	
	public void removeEmployee(Employee e){
		boolean isRemoved = false;
		for(int i=0; i<employees.length; i++){
			if(employees[i] == e && e != null){
				employees[i] = null;
				isRemoved = true;
				break;
			}
		}
		if(isRemoved){
			System.out.println("-------------------------------------------------");
			System.out.println("\t"+"The employee has been terminated successfully!");
			System.out.println("-------------------------------------------------");
			System.out.println();
		}else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching employee to be terminated. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}

	public Employee getEmployee(String empId){
		Employee e = null;
		for(int i=0; i<employees.length; i++){
			if(employees[i] != null && employees[i].getEmpId().equals(empId)){
				e = employees[i];
				break;
			}
		}
		return e;
	}

	public void showAllEmployees(){
		for(Employee e : employees){
			if( e!= null){
				System.out.println("#################################################");
				System.out.println("\tEmployee Name: "+e.getName());
				System.out.println("\tEmployee Id: "+e.getEmpId());
				System.out.println("\tEmployee Salary: "+e.getSalary());
				System.out.println("#################################################");
				System.out.println();
			}
		}
	}
}