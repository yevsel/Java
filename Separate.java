public class Separate {
    int[] numbers;

    public Separate(int[] args) {
        numbers = args;
    }

    public int[] even() {
        int[] result = new int[5];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[counter] = numbers[i];
                counter += 1;
            }
        }
        return result;
    }

    // ODD numbers
    public int[] odd() {
        int[] result = new int[5];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result[counter] = numbers[i];
                counter++;
            }
        }
        return result;
    }
}
