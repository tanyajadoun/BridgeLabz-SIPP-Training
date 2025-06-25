import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }

    void display() {
        System.out.println(itemName + " x" + quantity + " = ₹" + getTotal());
    }
}

public class Shopping_Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    cart.add(new CartItem(name, price, quantity));
                    System.out.println("Item added to cart.");
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String toRemove = sc.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).itemName.equalsIgnoreCase(toRemove)) {
                            cart.remove(i);
                            removed = true;
                            System.out.println("Item removed.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    double total = 0;
                    System.out.println("\n--- Cart Contents ---");
                    for (CartItem item : cart) {
                        item.display();
                        total += item.getTotal();
                    }
                    System.out.println("Total Cost: ₹" + total);
                    break;

                case 4:
                    System.out.println("Exiting cart. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
