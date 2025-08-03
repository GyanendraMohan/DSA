// max value of arr[j]-arr[i] where j>i
public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
        // int[] arr = { 7, 9, 5, 6, 3, 2 };
        int size = arr.length;
        maxDifference(arr, size);
        efficientMaxDifference(arr, size);
    }

    public static void maxDifference(int[] arr, int n) {
        int result = arr[1] - arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                result = max(result, arr[j] - arr[i]);
            }
        }
        System.out.println(result);
    }

    public static void efficientMaxDifference(int[] arr, int n) {
        int res = arr[1] - arr[0];
        int minValue = arr[0];
        for (int j = 1; j < n; j++) {
            res = max(res, arr[j] - minValue);
        }
        System.out.println(res);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
