package Searching;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 3, 4, 6 };
        int key = 3;
        int size = arr.length;
        int index = firstOccurence(arr, size, key);
        System.out.println(index);
    }

    public static int firstOccurence(int[] arr, int size, int k) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
