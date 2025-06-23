import java.util.*;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemMain {
    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 1001;
        i.itemName = "Pen";
        i.price = 10.5;
        i.displayDetails();
        System.out.println("Total Cost for 5: " + i.totalCost(5));
    }
}
