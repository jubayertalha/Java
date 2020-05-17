package Class;

import Interface.*;

public class FoodCourt implements RestaurentOperations, EmployeeOperations{
    private Restaurant restaurants[] = new Restaurant[500];
    private Employee employees[] = new Employee[100];

    public void insertRestaurant(Restaurant r) {
        int flag = 0;

        for (int i = 0; i < restaurants.length; i++) {
            if (restaurants[i] == null) {
                restaurants[i] = r;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println();
            System.out.println("Restaurant inserted");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Restaurant can not be inserted");
            System.out.println();
        }

    }

    public void removeRestaurant(Restaurant r) {
        int flag = 0;
        for (int i = 0; i < restaurants.length; i++) {
            if (restaurants[i] == r && r != null) {
                restaurants[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println();
            System.out.println("Restaurant removed");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Restaurant can not be removed");
            System.out.println();
        }
    }

    public Restaurant getRestaurant(String rid) {
        Restaurant r = null;
        for (int i = 0; i < restaurants.length; i++) {
            if (restaurants[i] != null && restaurants[i].getRid().equals(rid)) {
                r = restaurants[i];
                break;
            }
        }
        return r;
    }

    public void showAllRestaurants() {
        int flag = 1;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (Restaurant r : restaurants) {
            if (r != null) {
                System.out.println();
                System.out.println("Restaurant Name: " + r.getName());
                System.out.println("Restaurant Id: " + r.getRid());
                System.out.println("Food Items: ");
                r.showAllFoodItems();
                System.out.println();
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println();
            System.out.println("No Restaurant");
            System.out.println();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public void insertEmployee(Employee e) {
        int flag = 0;

        if (e.getSalary() >= 0) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = e;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println();
                System.out.println("Employee inserted");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Employee can not be inserted");
                System.out.println();
            }
        } else {
            System.out.println();
            System.out.println("Input can not be negative");
            System.out.println();
        }

    }

    public void removeEmployee(Employee e) {
        int flag = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == e && e != null) {
                employees[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println();
            System.out.println("Employee removed");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Employee can not be removed");
            System.out.println();
        }
    }

    public Employee getEmployee(String empId) {
        Employee e = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmpId().equals(empId)) {
                e = employees[i];
                break;
            }
        }
        return e;
    }

    public void showAllEmployees() {
        int flag = 1;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (Employee e : employees) {
            if (e != null) {
                System.out.println();
                System.out.println("\tEmployee Name: " + e.getName());
                System.out.println("\tEmployee Id: " + e.getEmpId());
                System.out.println("\tEmployee Salary: " + e.getSalary());
                System.out.println();
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println();
            System.out.println("No Employee");
            System.out.println();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}