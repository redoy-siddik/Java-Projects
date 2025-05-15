import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;
        boolean isValid = true;

        System.out.print("Enter the fist number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the operator (+, -, *, /, ^, %): ");
        operator = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    isValid = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            case '%' -> result = num1 % num2;
            default -> {
                System.out.println("Invalid operator");
                isValid = false;
            }
        }
        if (isValid)
            System.out.println(result);

        sc.close();
    }
}
