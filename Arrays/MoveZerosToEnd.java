public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };
        int n = arr.length;
        moveZerosToEnd(arr, n);
    }

    public static void moveZerosToEnd(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[j] != 0) {
                        swap(arr, i, j);
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// this code takes O(n^2) time complexity
