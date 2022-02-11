public class Parse {
    String value;
    double number;

    public Parse(String number) {
        this.number = Double.parseDouble(number) + 23;
    }

    public void see() {
        System.out.println(this.number * 2);
    }
}
