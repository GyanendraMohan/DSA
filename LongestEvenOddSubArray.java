public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 14, 7, 8 };
        int size = arr.length;
        int result = longestEvenOddSubArray(arr, size);
        System.out.println(result);
    }

    public static int longestEvenOddSubArray(int[] arr, int n) {
        if (n == 0)
            return 0;
        int maxLen = 1, currLen = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                    (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }
        return maxLen;
    }
}