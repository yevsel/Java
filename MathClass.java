public class MathClass {
    // Useful methods
    // Math.round() its overloaded
    // Math.ceil()
    // Math.floor()

    public int[] randomArray(int from, int to, int amount) {
        int[] arr = new int[amount];
        int difference = to - from;

        for (int i = 0; i < amount; i++) {
            arr[i] = (int) Math.round(Math.random() * difference) + from;
        }
        return arr;
    }

}
