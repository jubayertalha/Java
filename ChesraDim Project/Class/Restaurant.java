package Class;

import Interface.*;

public class Restaurant implements FoodItemOperations {
    private String rid;
    private String name;
    private FoodItem foodItems[] = new FoodItem[10];

    public void insertFoodItem(FoodItem f) {
        int flag = 0;
        if (f.getAvailableQuantity() >= 0 && f.getPrice() >= 0) {
            for (int i = 0; i < foodItems.length; i++) {
                if (foodItems[i] == null) {
                    foodItems[i] = f;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println();
                System.out.println("Item inserted");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Item can not be inserted");
                System.out.println();
            }
        } else {
            System.out.println();
            System.out.println("Input can not be negative");
            System.out.println();
        }
    }

    public void removeFoodItem(FoodItem f) {
        int flag = 0;
        for (int i = 0; i < foodItems.length; i++) {
            if (foodItems[i] == f && f != null) {
                foodItems[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println();
            System.out.println("Item removed");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Item can not be removed");
            System.out.println();
        }
    }

    public FoodItem getFoodItem(String fid) {
        FoodItem f = null;
        for (int i = 0; i < foodItems.length; i++) {
            if (foodItems[i] != null && foodItems[i].getFid().equals(fid)) {
                f = foodItems[i];
                break;
            }
        }
        return f;
    }

    public void showAllFoodItems() {
        int flag = 1;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (FoodItem f : foodItems) {
            if (f != null) {
                f.showInfo();
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println();
            System.out.println("No FoodItem");
            System.out.println();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
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