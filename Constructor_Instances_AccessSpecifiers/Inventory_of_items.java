import java.util.Scanner;

class Inventory_of_items {
    int itemCode;
    String itemName;
    double price;
    int quantity;

    void getDetails(Scanner sc) {
        System.out.print("Enter Item Code: ");
        itemCode = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    void display() {
        double total = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Inventory_of_items[] items = new Inventory_of_items[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Item " + (i + 1));
            items[i] = new Inventory_of_items();
            items[i].getDetails(sc);
        }

        System.out.println("\n--- Item Inventory ---");
        for (int i = 0; i < n; i++) {
            items[i].display();
        }
    }
}
