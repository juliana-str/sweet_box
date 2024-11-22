package numArray;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumsArray {
    private static final int ARRAY_SIZE = 20;

    private static void changeArray(int[] randomArray) {
        int maxNegativeValue = -10;
        int minPositiveValue = 10;
        for (int num : randomArray) {
            if (num < 0 && num > maxNegativeValue) {
                maxNegativeValue = num;
            } else if (num > 0 && num < minPositiveValue) {
                minPositiveValue = num;
            }
        }
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (randomArray[i] == minPositiveValue) {
                randomArray[i] = maxNegativeValue;
            } else if (randomArray[i] == maxNegativeValue) {
                randomArray[i] = minPositiveValue;
            }
        }
        System.out.println(Arrays.toString(randomArray));
    }

    public static void main(String[] args) {
        int[] randomArray = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            randomArray[i] = ThreadLocalRandom.current().nextInt(-10, 10);
        }
        changeArray(randomArray);
    }
}
