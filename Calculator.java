import java.util.Scanner;

public class Calculator {
    String operator;
    Scanner scanner = new Scanner(System.in);

    public void performTask() {
        double num1;
        double num2;
        System.out.print("Enter firt number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter operator: ");
        operator = scanner.next();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        answer(num1, num2);
    }

    private void answer(double num1, double num2) {
        // System.out.println("The operator is " + operator);
        System.out.println("Your answer is :");
        if (operator.toLowerCase().equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.toLowerCase().equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.toLowerCase().equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.toLowerCase().equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator!");
        }
    }
}
