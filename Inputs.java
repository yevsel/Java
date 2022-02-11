import java.util.Scanner;

public class Inputs {
    Scanner scanner = new Scanner(System.in);

    public String[] getNames(int howManyNames) {
        String[] names = new String[howManyNames];
        for (int i = 0; i < howManyNames; i++) {
            int calc = i + 1;
            System.out.print("Enter " + calc + " name: ");
            names[i] = scanner.nextLine().trim();
        }
        return names;
    }
}
