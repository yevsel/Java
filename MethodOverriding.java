public class MethodOverriding {
    // Constructor
    int number1;
    int number2;
    int number3;

    public MethodOverriding(int a, int b) {
        number1 = a;
        number2 = b;
        // info();
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    // private void info() {
    // System.out.println("Number 1: " + number1);
    // System.out.println("Number 2: " + number2);
    // }

}