public class OptimalSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        int size = arr.length;
        int sum = 10;
        boolean res = optimalSubArrayWithGivenSum(arr, size, sum);
        System.out.println(res);
    }

    public static boolean optimalSubArrayWithGivenSum(int[] arr, int n, int gievnSum) {
        int start = 0, currSum = 0;
        for (int end = 0; end < n; end++) {
            currSum += arr[end];
            while (gievnSum < currSum) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == gievnSum) {
                return true;
            }
        }
        return false;
    }
}
