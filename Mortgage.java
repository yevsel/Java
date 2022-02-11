
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    double price;
    double rate;
    int years;
    Scanner scanner = new Scanner(System.in);

    private void getPrice() {
        System.out.print("Enter Price(Principal): ");
        price = scanner.nextDouble();
    }

    private void getRate() {
        System.out.print("Enter the rate: ");
        rate = (scanner.nextDouble() / 100) / 12;
    }

    private void getYears() {
        System.out.print("How many years: ");
        years = scanner.nextInt() * 12;
    }

    public void calculateMortgage() {
        getPrice();
        getRate();
        getYears();
        double monthlyPayments;
        double numerator;
        double denominator;
        numerator = price * rate * Math.pow((1 + rate), years);
        denominator = Math.pow((1 + rate), years) - 1;
        monthlyPayments = (numerator / denominator);
        System.out.println("You have to pay: ");
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(monthlyPayments));
    }

}
