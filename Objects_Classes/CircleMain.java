import java.util.*;

class Circle {
    double radius;

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getCircumference() {
        return 2 * 3.14 * radius;
    }

    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5.0;
        c.display();
    }
}
