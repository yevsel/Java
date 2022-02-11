import java.util.Scanner;

public class UserInput {
    public String getName() {
        String name = "Selasi";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        name = scanner.nextLine();

        return name;
    }

    public int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        return age;
    }
}
