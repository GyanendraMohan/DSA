public class OptimalSlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 30, -5, 20, 7 };
        int k = 4;
        int size = arr.length;

        int result = optimalSlidingWIndowSum(arr, k, size);
        System.out.println(result);
    }

    public static int optimalSlidingWIndowSum(int[] arr, int k, int n) {
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        int resultSum = currSum;
        for (int i = k; i < n; i++) {
            currSum += arr[i] - arr[i - k];
            resultSum = Math.max(resultSum, currSum);
        }
        return resultSum;
    }
}
