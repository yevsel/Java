import java.util.Arrays;
import java.util.Date;

// import OuterClass.InnerClass;

public class App {
    public static void main(String[] args) throws Exception {
        // methodOverriding sums = new methodOverriding();
        // System.out.println(sums.sum(3, 4.4));
        // MethodOverriding sums = new MethodOverriding(34, 524);
        int[] numbers = { 3, 9, 3, 4, 2, 4, 6, 12, 7 };
        Separate sep = new Separate(numbers);
        // System.out.println("Even numbers:" + Arrasys.toString(sep.even()));
        // System.out.println("Odd numbers: " + Arrays.toString(sep.odd()));

        // Date Class
        Date now = new Date();
        // System.out.println(now.toString());

        // REMOVING DUPLICATES
        Inside inside = new Inside();
        // System.out.println(inside.instance(20, numbers));
        int[] nonDuplicate = new int[10];
        int nonDuplicateCounter = 0;

        // System.out.println("Does it exist: " + inside.instance(9, numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (!inside.instance(numbers[i], nonDuplicate)) {
                nonDuplicate[nonDuplicateCounter] = numbers[i];
                nonDuplicateCounter++;
            }
        }
        Arrays.sort(nonDuplicate);
        // System.out.println(Arrays.toString(nonDuplicate));

        // Multi deimensional arrays
        MultiArrays m = new MultiArrays();
        // m.multi();

        IntegerPrinter int1 = new IntegerPrinter(422);
        // int1.print();

        String v = "34";
        Parse p = new Parse(v);
        // p.see();

        MathClass m1 = new MathClass();

        // System.out.println(Arrays.toString(m1.randomArray(5, 17, 10)));

        Currency cur = new Currency();
        cur.perc();

        // GET USER INPUTS
        // UserInput user = new UserInput();
        // System.out.println("Welcome " + user.getName());
        // int age = user.getAge();
        // System.out.println("You are " + age + " years old.");

        // Arrays of names
        Inputs names = new Inputs();
        // String[] allNames = names.getNames(4);
        // System.out.println(Arrays.toString(allNames));

        // Calculator
        Calculator calc = new Calculator();
        // calc.performTask();

        // Mortgage
        Mortgage mortgage = new Mortgage();
        // mortgage.calculateMortgage();

        // Rock paper scissors
        RockPaper play = new RockPaper();

        // play.startGame();

        // Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.intro();

        // Static inner class
        OuterClass.StaticInnerClass in = new OuterClass.StaticInnerClass();
        in.desc();
    }

}
