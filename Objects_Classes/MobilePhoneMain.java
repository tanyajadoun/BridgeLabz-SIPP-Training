import java.util.*;

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "Samsung";
        m.model = "Galaxy M14";
        m.price = 14999.0;
        m.displayDetails();
    }
}
