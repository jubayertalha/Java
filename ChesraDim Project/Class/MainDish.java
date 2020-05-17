package Class;

public class MainDish extends FoodItem {
    private String category;

    public void showInfo() {
        System.out.println();
        System.out.println("Food Name: " + getName());
        System.out.println("Food Id: " + getFid());
        System.out.println("Food Category: " + category);
        System.out.println("Food Quantity: " + getAvailableQuantity());
        System.out.println("Food Price: " + getPrice());
        System.out.println();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}