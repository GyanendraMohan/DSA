public class RemoveDuplicateFromArrayEfficient {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
        int n = arr.length;
        removeDuplicate(arr, n);
    }

    public static void removeDuplicate(int[] arr, int size) {
        int res = 1;
        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
            System.out.println(arr[i]);
        }
    }
}
