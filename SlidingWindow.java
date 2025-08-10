public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 30, -5, 20, 7 };
        int size = arr.length;
        int k = 2;
        int result = maxSumOfConseKElements(arr, size, k);
        System.out.println(result);
    }

    public static int maxSumOfConseKElements(int[] arr, int n, int k) {
        if (n < k) {
            return -1; // Not enough elements
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int curSum = 0;
            for (int j = 0; j < k; j++) {
                curSum += arr[i + j];
            }
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
