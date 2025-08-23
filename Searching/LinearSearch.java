package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        // int[] arr = {};
        int element = 1;
        int indexOfSearchedElement = search(arr, element);
        System.out.println(indexOfSearchedElement);
    }

    public static int search(int[] arr, int k) {
        if (arr.length <= 0)
            return -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                index = i;
            }
        }
        return index;
    }
}
