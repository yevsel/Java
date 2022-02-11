public class Inside {
    public boolean instance(double number, int[] compare) {
        boolean isInside = false;
        for (int i = 0; i < compare.length; i++) {
            if ((double) compare[i] == number) {
                isInside = true;
            }
        }
        return isInside;
    }
}
