package Arrays.Array_prac;

import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println("First Array: "  + Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println("Sorted First Array: " + Arrays.toString(firstArray));

        int[] secondArray = getRandomArray(10);
        System.out.println("Second Array: " + Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println("Filled Second Array: " + Arrays.toString(secondArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newint = new int[len];
        for(int i = 0; i < len; i++) {
            newint[i] = random.nextInt(100);
        }   
        return newint;
    }
}
