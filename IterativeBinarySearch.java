public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 100;
        int index = iterativeBinarySearch(arr, k);
        System.out.println(index);
    }

    public static int iterativeBinarySearch(int[] arr, int element) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
