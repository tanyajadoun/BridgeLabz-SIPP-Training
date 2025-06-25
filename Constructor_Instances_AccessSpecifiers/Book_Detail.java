import java.util.Scanner;

class Book_Detail {
    String title;
    String author;
    double price;

    void getDetails(Scanner sc) {
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // clear buffer
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Book_Detail[] books = new Book_Detail[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Book " + (i + 1));
            books[i] = new Book_Detail();
            books[i].getDetails(sc);
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            books[i].display();
        }
    }
}
