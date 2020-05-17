package Class;

public class Appetiziers extends FoodItem {
    private String size;

    public void showInfo() {
        System.out.println();
        System.out.println("Food Name: " + getName());
        System.out.println("Food Id: " + getFid());
        System.out.println("Food Size: " + size);
        System.out.println("Food Quantity: " + getAvailableQuantity());
        System.out.println("Food Price: " + getPrice());
        System.out.println();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}