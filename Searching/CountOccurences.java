package Searching;

public class CountOccurences {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30, 40, 50};
        int key = 30;
        int result = countOccurences(arr, key);
        System.out.println("Number of occurrences of " + key + " is: " + result);
    }

    public static int countOccurences(int []arr, int key) {
        int count = 0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            if(arr[i] == key) {
                count++;
            }
        }
        return count;
    }
}
