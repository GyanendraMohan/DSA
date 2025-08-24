public class RecBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 20;
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int index = recBinarySearch(arr, k, low, high);
        System.out.println(index);
    }

    public static int recBinarySearch(int[] arr, int k, int low, int high) {
        int mid = (low + high) / 2;
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] > k) {
            return recBinarySearch(arr, k, low, mid - 1);
        } else {
            return recBinarySearch(arr, k, mid + 1, high);
        }
    }
}
