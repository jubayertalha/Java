import Class.*;
import FileIO.*;
import java.io.*;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        FileReadWriteDemo frwd = new FileReadWriteDemo();
        FoodCourt f = new FoodCourt();

        int flag = 1;

        while (flag == 1) {
            System.out.println("What do you want to do?");
            System.out.println("1. Employee Management");
            System.out.println("2. Restaurant Management");
            System.out.println("3. Restaurent Food Item Management");
            System.out.println("4. FoodItem Quantity Add-Sell");
            System.out.println("5. Exit");

            System.out.print("Your Option: ");
            int option;
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }

            switch (option) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen Employee Management");
                    System.out.println("-----------------------------------------");

                    System.out.println("What do you want to do?");
                    System.out.println("1. Insert New Employee");
                    System.out.println("2. Remove Existing Employee");
                    System.out.println("3. Show All Employees");
                    System.out.println("4. Search an Employee");
                    System.out.println("5. Go Back");

                    System.out.print("Your Option: ");
                    int c1;
                    try {
                        c1 = sc.nextInt();
                    } catch (Exception e) {
                        c1 = 0;
                    }

                    switch (c1) {
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("Insert New Employee");

                            Employee e = new Employee();

                            try {
                                System.out.print("Enter Employee ID: ");
                                String empId1 = sc.next();
                                e.setEmpId(empId1);

                                System.out.print("Enter Employee Name: ");
                                String name1 = sc.next();
                                e.setName(name1);

                                System.out.print("Enter Employee Salary: ");
                                double salary1 = sc.nextDouble();
                                e.setSalary(salary1);

                                f.insertEmployee(e);

                            } catch (Exception ex) {
                                System.out.println("Invalid Input");
                            }
                            System.out.println("-----------------------------------------");
                            break;

                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("Remove Existing Employee");

                            System.out.print("Enter Employee ID: ");
                            String empId2;
                            try {
                                empId2 = sc.next();
                                f.removeEmployee(f.getEmployee(empId2));
                            } catch (Exception ex) {
                                System.out.println("Invalid Input");
                            }

                            System.out.println("-----------------------------------------");
                            break;

                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("Show All Employees");

                            f.showAllEmployees();

                            System.out.println("-----------------------------------------");

                            break;

                        case 4:
                            System.out.println("-----------------------------------------");
                            System.out.println("Search an Employee");

                            System.out.print("Enter Employee ID: ");
                            String empId3;
                            try {
                                empId3 = sc.next();
                                Employee e3 = f.getEmployee(empId3);

                                if (e3 != null) {
                                    System.out.println("Employee ID is: " + e3.getEmpId());
                                    System.out.println("Employee Name is: " + e3.getName());
                                    System.out.println("Employee Salary is: " + e3.getSalary());
                                } else {
                                    System.out.println("Employee Does NOT Exists");
                                }
                            } catch (Exception ex) {
                                System.out.println("Invalid Input");
                            }

                            System.out.println("-----------------------------------------");
                            break;

                        case 5:
                            System.out.println("-----------------------------------------");
                            System.out.println("Going Back");
                            System.out.println("-----------------------------------------");
                            break;

                        default:

                            System.out.println("-----------------------------------------");
                            System.out.println("Invalid");
                            System.out.println("-----------------------------------------");
                            break;
                    }

                    break;

                case 2:

                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen Restaurant Management");
                    System.out.println("-----------------------------------------");

                    System.out.println("What do you want to do?");
                    System.out.println("1. Insert New Restaurent");
                    System.out.println("2. Remove Existing Restaurent");
                    System.out.println("3. Show All Restaurents");
                    System.out.println("4. Search a Restaurent");
                    System.out.println("5. Go Back");

                    System.out.print("Your Option: ");
                    int c2;
                    try {
                        c2 = sc.nextInt();
                    } catch (Exception e) {
                        c2 = 0;
                    }

                    switch (c2) {
                        case 1:
                            try {
                                System.out.println("-----------------------------------------");
                                System.out.println("Insert New Restaurent");

                                Restaurant rest1 = new Restaurant();

                                System.out.print("Enter Restaurant ID: ");
                                String restId1 = sc.next();
                                rest1.setRid(restId1);
                                String name1;
                                System.out.print("Enter Restaurant Name: ");

                                name1 = bfr.readLine();
                                rest1.setName(name1);

                                f.insertRestaurant(rest1);

                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                            }
                            System.out.println("-----------------------------------------");
                            break;

                        case 2:
                            try {
                                System.out.println("-----------------------------------------");
                                System.out.println("Remove Existing Restaurant");

                                System.out.print("Enter Restaurant ID: ");
                                String restId2 = sc.next();
                                Restaurant rest2 = f.getRestaurant(restId2);
                                f.removeRestaurant(rest2);

                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                            }
                            System.out.println("-----------------------------------------");
                            break;

                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("Show All Restaurant");

                            f.showAllRestaurants();

                            System.out.println("-----------------------------------------");

                            break;

                        case 4:
                            try {
                                System.out.println("-----------------------------------------");
                                System.out.println("Search a Restaurant");

                                System.out.print("Enter Restaurant ID: ");
                                String restId3 = sc.next();

                                Restaurant rest3 = f.getRestaurant(restId3);

                                if (rest3 != null) {
                                    System.out.println("Restaurant ID: " + rest3.getRid());
                                    System.out.println("Restaurant Name: " + rest3.getName());
                                    rest3.showAllFoodItems();
                                } else {
                                    System.out.println("Restaurant Does NOT Exists");
                                }

                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                            }
                            System.out.println("-----------------------------------------");
                            break;

                        case 5:
                            System.out.println("-----------------------------------------");
                            System.out.println("Going Back");
                            System.out.println("-----------------------------------------");
                            break;

                        default:

                            System.out.println("-----------------------------------------");
                            System.out.println("Invalid");
                            System.out.println("-----------------------------------------");
                            break;
                    }

                    break;

                case 3:

                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen Restaurant Food Item Management");
                    System.out.println("-----------------------------------------");

                    System.out.println("What do you want to do?");
                    System.out.println("1. Insert New FoodItem");
                    System.out.println("2. Remove Existing FoodItem");
                    System.out.println("3. Show All FoodItems");
                    System.out.println("4. Search a FoodItem");
                    System.out.println("5. Go Back");

                    System.out.print("Your Option: ");
                    int c3;
                    try {
                        c3 = sc.nextInt();
                    } catch (Exception e) {
                        c3 = 0;
                    }

                    switch (c3) {
                        case 1:
                            System.out.println("-----------------------------------------");
                            System.out.println("Insert New Food Item for a Restaurant\n");
                            System.out.println("Which Type of Food Item do you want?");
                            System.out.println("1. Main Dish");
                            System.out.println("2. Appetizire");
                            System.out.println("3. Go Back");

                            System.out.print("Your Type: ");
                            int type;
                            try {
                                type = sc.nextInt();
                            } catch (Exception e) {
                                type = 0;
                            }

                            FoodItem fi = null;

                            if (type == 1) {
                                try {
                                    System.out.print("Enter Main Dish Id : ");
                                    String fi1 = sc.next();
                                    System.out.print("Enter Main Dish Name : ");
                                    String fn1 = bfr.readLine();
                                    System.out.print("Enter Main Dish Category : ");
                                    String fc1 = bfr.readLine();
                                    System.out.print("Enter Main Dish Price : ");
                                    double fp1 = sc.nextDouble();
                                    System.out.print("Enter Main Dish Available Quantity : ");
                                    int fq1 = sc.nextInt();

                                    MainDish md = new MainDish();
                                    md.setFid(fi1);
                                    md.setName(fn1);
                                    md.setCategory(fc1);
                                    md.setPrice(fp1);
                                    md.setAvailableQuantity(fq1);

                                    fi = md;
                                } catch (Exception e) {
                                    System.out.println("Invalid Input");
                                }
                            } else if (type == 2) {
                                try {
                                    System.out.print("Enter Appetizer Id : ");
                                    String fi2 = sc.next();
                                    System.out.print("Enter Appetizer Name : ");
                                    String fn2 = bfr.readLine();
                                    System.out.print("Enter Appetizer Size : ");
                                    String fs2 = bfr.readLine();
                                    System.out.print("Enter Appetizer Price : ");
                                    double fp2 = sc.nextDouble();
                                    System.out.print("Enter Appetizer Available Quantity : ");
                                    int fq2 = sc.nextInt();

                                    Appetiziers ap = new Appetiziers();
                                    ap.setFid(fi2);
                                    ap.setName(fn2);
                                    ap.setSize(fs2);
                                    ap.setPrice(fp2);
                                    ap.setAvailableQuantity(fq2);

                                    fi = ap;
                                } catch (Exception e) {
                                    System.out.println("Invalid Input");
                                }
                            } else if (type == 3) {
                                System.out.println("Going Back ...");
                            } else {
                                System.out.println("Invalid Type");
                            }

                            if (fi != null) {
                                try {
                                    System.out.print("Enter Restaurant ID: ");
                                    String frid1 = sc.next();

                                    f.getRestaurant(frid1).insertFoodItem(fi);
                                } catch (Exception e) {
                                    System.out.println("Invalid Input");
                                }

                            }

                            System.out.println("-----------------------------------------");
                            break;

                        case 2:
                            System.out.println("-----------------------------------------");
                            System.out.println("Remove Existing Food Item");

                            try {
                                System.out.print("Enter Restaurant ID: ");
                                String frid2 = sc.next();
                                System.out.print("Enter Food Item ID: ");
                                String ffid2 = sc.next();
                                f.getRestaurant(frid2).removeFoodItem(f.getRestaurant(frid2).getFoodItem(ffid2));
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                            }

                            System.out.println("-----------------------------------------");
                            break;

                        case 3:
                            System.out.println("-----------------------------------------");
                            System.out.println("Show All Food Items");
                            String frid4;
                            try {
                                System.out.print("Enter Restaurant ID: ");
                                frid4 = sc.next();
                                f.getRestaurant(frid4).showAllFoodItems();
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                                break;
                            }

                            System.out.println("-----------------------------------------");

                            break;

                        case 4:
                            System.out.println("-----------------------------------------");
                            System.out.println("Search a Food Item of a Restaurant");
                            String frid3;
                            String ffid3;
                            try {
                                System.out.print("Enter Restaurant ID: ");
                                frid3 = sc.next();
                                System.out.print("Enter Food Item ID: ");
                                ffid3 = sc.next();
                                FoodItem f3 = f.getRestaurant(frid3).getFoodItem(ffid3);

                                if (f3 != null) {
                                    f3.showInfo();
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                            }

                            System.out.println("-----------------------------------------");
                            break;

                        case 5:
                            System.out.println("-----------------------------------------");
                            System.out.println("Going Back");
                            System.out.println("-----------------------------------------");
                            break;

                        default:

                            System.out.println("-----------------------------------------");
                            System.out.println("Invalid");
                            System.out.println("-----------------------------------------");
                            break;
                    }

                    break;

                case 4:

                    System.out.println("-----------------------------------------");
                    System.out.println("You have choosen FoodItem Quantity Add-Sell");
                    System.out.println("-----------------------------------------");

                    System.out.println("What do you want to do?\n");
                    System.out.println("1. Add FoodItem");
                    System.out.println("2. Sell FoodItem");
                    System.out.println("3. Show Add Sell History");
                    System.out.println("4. Go Back");

                    System.out.print("Your Option: ");
                    int c4;
                    try {
                        c4 = sc.nextInt();
                    } catch (Exception e) {
                        c4 = 0;
                    }

                    switch (c4) {
                        case 1:

                            System.out.println("-----------------------------------------");
                            System.out.println("Add Food Item");

                            String frid3;
                            String ffid3;
                            int amount1;
                            try {
                                System.out.print("Enter Restaurant ID: ");
                                frid3 = sc.next();
                                System.out.print("Enter Food Item ID: ");
                                ffid3 = sc.next();
                                System.out.print("Enter Add Amount: ");
                                amount1 = sc.nextInt();
                                if (amount1 >= 1) {
                                    f.getRestaurant(frid3).getFoodItem(ffid3).addQuantity(amount1);
                                    frwd.writeInFile(amount1 + " " + f.getRestaurant(frid3).getFoodItem(ffid3).getName()
                                            + " has been Added");
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                            }

                            System.out.println("-----------------------------------------");
                            break;

                        case 2:

                            System.out.println("-----------------------------------------");
                            System.out.println("Sell Food Item");

                            String frid4;
                            String ffid4;
                            int amount2;
                            try {
                                System.out.print("Enter Restaurant ID: ");
                                frid4 = sc.next();
                                System.out.print("Enter Food Item ID: ");
                                ffid4 = sc.next();
                                System.out.print("Enter Add Amount: ");
                                amount2 = sc.nextInt();
                                if (amount2 >= 1 && amount2 <= f.getRestaurant(ffid4).getFoodItem(ffid4)
                                        .getAvailableQuantity()) {
                                    f.getRestaurant(frid4).getFoodItem(ffid4).sellQuantity(amount2);
                                    frwd.writeInFile(amount2 + " " + f.getRestaurant(frid4).getFoodItem(ffid4).getName()
                                            + " has been Sold");
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid Input");
                            }

                            System.out.println("-----------------------------------------");
                            break;

                        case 3:

                            System.out.println("-----------------------------------------");
                            System.out.println("Show Add-Sell History");
                            frwd.readFromFile();
                            System.out.println("-----------------------------------------");
                            break;

                        case 4:

                            System.out.println("-----------------------------------------");
                            System.out.println("Going back....");
                            System.out.println("-----------------------------------------");
                            break;

                        default:

                            System.out.println("-----------------------------------------");
                            System.out.println("Invalid");
                            System.out.println("-----------------------------------------");
                            break;
                    }

                    break;

                case 5:

                    System.out.println("You have choosen to exit");
                    flag = 0;
                    sc.close();
                    break;

                default:

                    System.out.println("Invalid Option");
                    sc = new Scanner(System.in);
                    break;
            }
        }
    }
}