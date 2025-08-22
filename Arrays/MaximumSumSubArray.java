public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        int size = arr.length;
        int maxSumSubArray = calculateMaxSumSubArray(arr, size);
        System.out.println(maxSumSubArray);
    }

    public static int calculateMaxSumSubArray(int[] arr, int n) {
        int sum = arr[0];
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
            }
            sum = Math.max(sum, currentSum);
        }
        return sum;
    }
}
