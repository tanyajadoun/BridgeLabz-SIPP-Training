class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Cost: " + total);
    }
}

public class cartItemMain {
    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.addItem("Notebook", 50.0, 3);
        c.displayTotalCost();
        c.removeItem();
    }
}
