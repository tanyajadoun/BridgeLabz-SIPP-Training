
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        float number1 = sc.nextFloat();
        System.out.println("Enter number2:");
        float number2 = sc.nextFloat();

        float add = addition(number1, number2);
        float sub = subtraction(number1, number2);
        float mul = multiplication(number1, number2);
        float div = division(number1, number2);

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1
                + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }

    public static float addition(float a, float b) {
        return a + b;
    }

    public static float subtraction(float a, float b) {
        return a - b;
    }

    public static float multiplication(float a, float b) {
        return a * b;
    }

    public static float division(float a, float b) {
        return a / b;
    }
}
