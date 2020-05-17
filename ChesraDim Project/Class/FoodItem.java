package Class;

import Interface.*;

public abstract class FoodItem implements IQuantity {
    protected String fid;
    protected String name;
    protected int availableQuantity;
    protected double price;

    public void addQuantity(int amount) {
        if (amount >= 1) {
            availableQuantity += amount;
            System.out.println();
            System.out.println(amount + " quantity added");
            System.out.println();
        } else {
            System.out.println();
            System.out.println(amount + " quantity can not be added");
            System.out.println();
        }
    }

    public void sellQuantity(int amount) {
        if (amount >= 1 && amount <= availableQuantity) {
            availableQuantity -= amount;
            System.out.println();
            System.out.println(amount + " quantity sold");
            System.out.println();
        } else {
            System.out.println();
            System.out.println(amount + " quantity can not be added");
            System.out.println();
        }
    }

    public abstract void showInfo();

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}