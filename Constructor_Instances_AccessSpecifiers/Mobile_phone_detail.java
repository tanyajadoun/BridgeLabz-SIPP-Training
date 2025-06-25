import java.util.Scanner;

class Mobile_phone_detail {
    String brand;
    String model;
    double price;

    void getDetails(Scanner sc) {
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // clear input buffer
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3; // Minimum 3 inputs
        Mobile_phone_detail[] phones = new Mobile_phone_detail[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Mobile Phone " + (i + 1));
            phones[i] = new Mobile_phone_detail();
            phones[i].getDetails(sc);
        }
        System.out.println("\n--- Mobile Phone Details ---");
        for (int i = 0; i < n; i++) {
            phones[i].displayDetails();
        }
    }
}
