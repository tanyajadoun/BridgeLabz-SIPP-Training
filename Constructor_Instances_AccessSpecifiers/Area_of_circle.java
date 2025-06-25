import java.util.Scanner;

class Area_of_circle {
    double radius;

    void getInput(Scanner sc) {
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Area_of_circle[] circles = new Area_of_circle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Circle " + (i + 1));
            circles[i] = new Area_of_circle();
            circles[i].getInput(sc);
        }

        System.out.println("\n--- Circle Details ---");
        for (int i = 0; i < n; i++) {
            circles[i].display();
        }
    }
}
