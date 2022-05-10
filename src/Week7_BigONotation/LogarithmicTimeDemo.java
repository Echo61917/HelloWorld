package Week7_BigONotation;

import java.util.Arrays;

public class LogarithmicTimeDemo {
    public static void main(String[] args) {
        for (int n = 32; n <= 536_870_912; n *= 2) {
            int[] array = createArrayOfSize(n);

            long time = System.nanoTime();
            Arrays.binarySearch(array, 0);
            time = System.nanoTime() - time;

            System.out.printf("n = %d -> time = %d ns%n", n, time);
        }
    }

    private static int[] createArrayOfSize(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}
