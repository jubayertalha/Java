import classes.*;
import file.*;
import java.io.*;
import java.util.*;

public class Start {

	private static Scanner sc = new Scanner(System.in);
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader bfr = new BufferedReader(isr);
	private static FileOperation fileOperation;

	public static void main(String args[]) {

		System.out.println("\n");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^  WELCOME TO FOOD COURT MANAGEMENT APP ^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("\n");

		fileOperation = new FileOperation();
		FoodCourt foodCourt = new FoodCourt();
		showMainMenu(foodCourt);
	}

	private static String getLineString(){
		String s = "null";
		try {
			s = bfr.readLine();
		} catch (IOException e) {
			s = "null";
			sc = new Scanner(System.in);
		} catch (InputMismatchException e){
			s = "null";
			sc = new Scanner(System.in);
		} catch (NoSuchElementException e){
			s = "null";
			sc = new Scanner(System.in);
		}
		if(s==null){
			s = "null";
		}
		return s;
	}

	private static String getString(){
		String s = "null";
		try {
			s = sc.next();
		} catch (InputMismatchException e){
			s = "null";
		} catch (NoSuchElementException e){
			s = "null";
		}
		sc = new Scanner(System.in);
		return s;
	}

	private static double getDouble(){
		double d = 0;
		try {
			d = sc.nextDouble();
		} catch (InputMismatchException e){
			d = -1;
		} catch (NoSuchElementException e){
			d = -1;
		}sc = new Scanner(System.in);
		return d;
	}

	private static int getInt(){
		int i = 0;
		try {
			i = sc.nextInt();
		} catch (InputMismatchException e){
			i = -1;
		} catch (NoSuchElementException e){
			i = -1;
		}
		sc = new Scanner(System.in);
		return i;
	}

	private static void insertNewEmployee(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("'''''''''''    Insert New Employee    '''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		Employee employee = new Employee();
		String name = "";
		String id = "";
		double salary = 0;
		System.out.print("\tEnter Employee Name: ");
		name = getLineString();
		System.out.print("\tEnter Employee Id: ");
		id = getString();
		System.out.print("\tEnter Employee Salary: ");
		salary = getDouble();
		if(!name.equals("null")&&!id.equals("null")&&salary!=-1){
			employee.setSalary(salary);
			employee.setEmpId(id);
			employee.setName(name);
			foodCourt.insertEmployee(employee);
		}else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}

	private static void removeExistingEmployee(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("'''''''    Remove Existing Employee    ''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Employee Id: ");
		foodCourt.removeEmployee(foodCourt.getEmployee(getString()));
	}

	private static void showAllEmployees(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("'''''''''''    Show All Employees    ''''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		foodCourt.showAllEmployees();
	}

	private static void searchAnEmployee(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''    Search An Employee    '''''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Employee Id: ");
		Employee e = foodCourt.getEmployee(getString());
		if (e != null) {
			System.out.println("#################################################");
			System.out.println("\tEmployee Name: " + e.getName());
			System.out.println("\tEmployee Id: " + e.getEmpId());
			System.out.println("\tEmployee Salary: " + e.getSalary());
			System.out.println("#################################################");
			System.out.println();
		} else {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t" + "Sorry.. There is no matching employee with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}

	private static void insertNewRestaurant(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''     Insert New Restaurant    '''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		Restaurant restaurant = new Restaurant();
		String name = "";
		String id = "";
		System.out.print("\tEnter Restaurant Name: ");
		name = getLineString();
		System.out.print("\tEnter Restaurent Id: ");
		id = getString();
		if(!name.equals("null")&&!id.equals("null")){
			restaurant.setName(name);
			restaurant.setRid(id);
			foodCourt.insertRestaurant(restaurant);;
		}else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}

	private static void removeExistingRestaurant(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''     Remove Existing Restaurant    ''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurant Id: ");
		foodCourt.removeRestaurant(foodCourt.getRestaurant(getString()));
	}

	private static void showAllRestaurants(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''     Show All Restaurants    ''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		foodCourt.showAllRestaurants();
	}

	private static void searchARestaurant(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''     Search A Restaurant    '''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurent Id: ");
		Restaurant r = foodCourt.getRestaurant(getString());
		if (r != null) {
			System.out.println("#################################################");
			System.out.println("\tRestaurant Name: " + r.getName());
			System.out.println("\tRestaurant Id: " + r.getRid());
			System.out.println("\ttFood Items: ");
			r.showAllFoodItems();
			System.out.println("#################################################");
			System.out.println();
		} else {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t" + "Sorry.. There is no matching restaurant with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}
	}

	private static void insertNewFoodItem(FoodCourt foodCourt) {
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''      Insert New FoodITem     '''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurant Id: ");
		Restaurant restaurant = foodCourt.getRestaurant(getString());
		int option = 0;
		if (restaurant == null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t" + "Sorry.. There is no matching restaurant with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		} else {
			System.out.println("\t\t1. Insert New MainDish.");
			System.out.println("\t\t2. Insert New Appitizer.");
			System.out.print("\t\tEnter Your Option: ");
			option = getInt();
			if (option == 1) {
				MainDish mainDish = new MainDish();
				String name = "";
				String category = "";
				double price = 0;
				int quantity = 0;
				String id = "";
				System.out.print("\t\tEnter MainDish Name: ");
				name = getLineString();
				System.out.print("\t\tEnter MainDish Category: ");
				category = getLineString();
				System.out.print("\t\tEnter MainDish Price: ");
				price = getDouble();
				System.out.print("\t\tEnter MainDish Available Quantity: ");
				quantity = getInt();
				System.out.print("\t\tEnter MainDish Id: ");
				id = getString();
				if(!name.equals("null")&&!category.equals("null")&&!category.equals("")&&price!=-1&&quantity!=-1&&!id.equals("null")){
					mainDish.setName(name);
					mainDish.setCategory(category);
					mainDish.setPrice(price);
					mainDish.setAvailableQuantity(quantity);
					mainDish.setFid(id);
					restaurant.insertFoodItem(mainDish);
				}else{
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
				}
			} else if (option == 2) {
				Appetiziers appetiziers = new Appetiziers();
				String name = "";
				String size = "";
				double price = 0;
				int quantity = 0;
				String id = "";
				System.out.print("\t\tEnter Appitizier Name: ");
				name = getLineString();
				System.out.print("\t\tEnter Appitizer Size: ");
				size = getLineString();
				System.out.print("\t\tEnter Appitizer Price: ");
				price = getDouble();
				System.out.print("\t\tEnter Appitizer Available Quantity: ");
				quantity = getInt();
				System.out.print("\t\tEnter Appitizer Id: ");
				id = getString();
				if(!name.equals("null")&&!size.equals("null")&&!size.equals("")&&price!=-1&&quantity!=-1&&!id.equals("null")){
					appetiziers.setName(name);
					appetiziers.setSize(size);
					appetiziers.setPrice(price);
					appetiziers.setAvailableQuantity(quantity);
					appetiziers.setFid(id);
					restaurant.insertFoodItem(appetiziers);
				}else{
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
				}
			}else{
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println();
			}
		}
	}

	private static void removeExistingFoodItem(FoodCourt foodCourt){
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("'''''''     Remove Existing FoodItem    '''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurant Id: ");
		Restaurant restaurant = foodCourt.getRestaurant(getString());
		if(restaurant == null){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching restaurant with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}else{
			System.out.print("\tEnter FoodItem Id: ");
			restaurant.removeFoodItem(restaurant.getFoodItem(getString()));
		}
	}

	private static void showAllFoodItems(FoodCourt foodCourt){
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''      Show All FoodItems     ''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurant Id: ");
		Restaurant restaurant = foodCourt.getRestaurant(getString());
		if(restaurant == null){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching restaurant with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}else{
			restaurant.showAllFoodItems();
		}
	}

	private static void searchAFoodItem(FoodCourt foodCourt){
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''     Search A FoodItem    '''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurent Id: ");
		Restaurant r = foodCourt.getRestaurant(getString());
		if(r == null){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching restaurant with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}else{
			System.out.print("\tEnter FoodItem Id: ");
			FoodItem f = r.getFoodItem(getString());
			if(f != null){
				f.showInfo();
			}else{
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("\t"+"Sorry.. There is no matching food item with this Id. Please try again!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println();
			}
		}
	}

	private static void addFoodItem(FoodCourt foodCourt){
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("'''''''''''''      Add FoodItem    ''''''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurent Id: ");
		Restaurant r = foodCourt.getRestaurant(getString());
		if(r == null){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching restaurant with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}else{
			System.out.print("\tEnter FoodItem Id: ");
			FoodItem f = r.getFoodItem(getString());
			if(f != null){
				System.out.print("\tEnter Amount You Want to Add: ");
				int amount = getInt();
				int previous = f.getAvailableQuantity();
				int current = previous+amount;
				f.addQuantity(amount);
				if(amount>=1){
					String s = "*************************************************\r\n";
					s += "\tActivity Type: Add"+"\r\n";
					s += "\tFood Id: "+f.getFid()+"\r\n";
					s += "\tFood Name: "+f.getName()+"\r\n";
					s += "\tAdding Quantity: "+amount+"\r\n";
					s += "\tPrevious Stock: "+previous+"\r\n";
					s += "\tCurrent Stock: "+current+"\r\n";
					s += "\tAdding Restaurant Id: "+r.getRid()+"\r\n";
					s += "\tAdding Restaurant Name: "+r.getName()+"\r\n";
					s += "*************************************************\r\n";
					fileOperation.write(s+"\r"+"\n");
				}
			}else{
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("\t"+"Sorry.. There is no matching food item with this Id. Please try again!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println();
			}
		}
	}

	private static void sellFoodItem(FoodCourt foodCourt){
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("'''''''''''''     Sell FoodItem    ''''''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.print("\tEnter Restaurent Id: ");
		Restaurant r = foodCourt.getRestaurant(getString());
		if(r == null){
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("\t"+"Sorry.. There is no matching restaurant with this Id. Please try again!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
		}else{
			System.out.print("\tEnter FoodItem Id: ");
			FoodItem f = r.getFoodItem(getString());
			if(f != null){
				System.out.print("\tEnter Amount You Want to Sell: ");
				int amount = getInt();
				int previous = f.getAvailableQuantity();
				int current = previous-amount;
				f.sellQuantity(amount);
				if(amount>=1&&amount<=previous){
					String s = "*************************************************\r\n";
					s += "\tActivity Type: Sell"+"\r\n";
					s += "\tFood Id: "+f.getFid()+"\r\n";
					s += "\tFood Name: "+f.getName()+"\r\n";
					s += "\tSelling Quantity: "+amount+"\r\n";
					s += "\tPrevious Stock: "+previous+"\r\n";
					s += "\tCurrent Stock: "+current+"\r\n";
					s += "\tSeller Restaurant Id: "+r.getRid()+"\r\n";
					s += "\tSeller Restaurant Name: "+r.getName()+"\r\n";
					s += "*************************************************\r\n";
					fileOperation.write(s+"\r"+"\n");
				}
			}else{
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("\t"+"Sorry.. There is no matching food item with this Id. Please try again!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println();
			}
		}
	}

	private static void showAddSellHistory(FoodCourt foodCourt){
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''''''   Add Sell History   '''''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''");
		
		fileOperation.read();
	}

	private static void showMainMenu(FoodCourt foodCourt) {
		boolean isContinue = true;
		while(isContinue){
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("+++++++++++++        Main Menu       ++++++++++++");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Restaurant Management");
			System.out.println("\t3. Restaurant FoodItem Management");
			System.out.println("\t4. FoodItem Quantity Add-Sell");
			System.out.println("\t5. Exit (or hold Ctrl + c to Force Stop)");
			System.out.print("\tEnter Your Option: ");
			int option = getInt();
			switch(option){
				case 1:
					showEmployeeManagementMenu(foodCourt);
					break;
				case 2:
					showRestaurentManagementMenu(foodCourt);
					break;
				case 3:
					showRestaurentFoodItemManagementMenu(foodCourt);
					break;
				case 4:
					showFoodItemQuantitytMenu(foodCourt);
					break;
				case 5:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("~~~~~~~~~~~~~       Terminated       ~~~~~~~~~~~~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					isContinue = false;
					break;
				default:
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
					break;
			}
		}
	}

	private static void showEmployeeManagementMenu(FoodCourt foodCourt){
		boolean isContinue = true;
		while(isContinue){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~   Employee Management  ~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t1. Insert New Employee");
			System.out.println("\t2. Remove Existing Employee");
			System.out.println("\t3. Show All Employees");
			System.out.println("\t4. Search an Employee");
			System.out.println("\t5. Go Back");
			System.out.print("\tEnter Your Option: ");
			int option = getInt();
			switch(option){
				case 1:
					insertNewEmployee(foodCourt);
					break;
				case 2:
					removeExistingEmployee(foodCourt);
					break;
				case 3:
					showAllEmployees(foodCourt);
					break;
				case 4:
					searchAnEmployee(foodCourt);
					break;
				case 5:
					isContinue = false;
					break;
				default:
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
					break;
			}
		}
	}

	private static void showRestaurentManagementMenu(FoodCourt foodCourt){
		boolean isContinue = true;
		while(isContinue){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~  Restaurent Management ~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t1. Insert New Restaurent");
			System.out.println("\t2. Remove Existing Restaurent");
			System.out.println("\t3. Show All Restaurents");
			System.out.println("\t4. Search a Restaurent");
			System.out.println("\t5. Go Back");
			System.out.print("\tEnter Your Option: ");
			int option = getInt();
			switch(option){
				case 1:
					insertNewRestaurant(foodCourt);
					break;
				case 2:
					removeExistingRestaurant(foodCourt);
					break;
				case 3:
					showAllRestaurants(foodCourt);
					break;
				case 4:
					searchARestaurant(foodCourt);
					break;
				case 5:
					isContinue = false;
					break;
				default:
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
					break;
			}
		}
	}

	private static void showRestaurentFoodItemManagementMenu(FoodCourt foodCourt){
		boolean isContinue = true;
		while(isContinue){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~ Restaurent FoodItem Management ~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t1. Insert New FoodItem");
			System.out.println("\t2. Remove Existing FoodItem");
			System.out.println("\t3. Show All FoodItems");
			System.out.println("\t4. Search a FoodItem");
			System.out.println("\t5. Go Back");
			System.out.print("\tEnter Your Option: ");
			int option = getInt();
			switch(option){
				case 1:
					insertNewFoodItem(foodCourt);
					break;
				case 2:
					removeExistingFoodItem(foodCourt);;
					break;
				case 3:
					showAllFoodItems(foodCourt);
					break;
				case 4:
					searchAFoodItem(foodCourt);
					break;
				case 5:
					isContinue = false;
					break;
				default:
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
					break;
			}
		}
	}

	private static void showFoodItemQuantitytMenu(FoodCourt foodCourt){
		boolean isContinue = true;
		while(isContinue){
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~   FoodItem Quantity Add-Sell   ~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t1. Add FoodItem");
			System.out.println("\t2. Sell FoodItem");
			System.out.println("\t3. Show Add Sell History");
			System.out.println("\t4. Go Back");
			System.out.print("\tEnter Your Option: ");
			int option = getInt();
			switch(option){
				case 1:
					addFoodItem(foodCourt);
					break;
				case 2:
					sellFoodItem(foodCourt);
					break;
				case 3:
					showAddSellHistory(foodCourt);
					break;
				case 4:
					isContinue = false;
					break;
				default:
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("\t"+"Sorry.. The input is invalid. Please try again!");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
					break;
			}
		}
	}
}
