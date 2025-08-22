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

// class Solution {
// public int maxIndexDiff(int[] arr) {
// int n = arr.length;
// if (n < 2)
// return 0;

// int[] LMin = new int[n];
// int[] RMax = new int[n];

// // LMin[i] = min(arr[0..i])
// LMin[0] = arr[0];
// for (int i = 1; i < n; i++) {
// LMin[i] = Math.min(LMin[i - 1], arr[i]);
// }

// // RMax[j] = max(arr[j..n-1])
// RMax[n - 1] = arr[n - 1];
// for (int j = n - 2; j >= 0; j--) {
// RMax[j] = Math.max(RMax[j + 1], arr[j]);
// }

// // Two-pointer sweep to maximize (j - i) with LMin[i] < RMax[j]
// int i = 0, j = 0, maxDiff = 0;
// while (i < n && j < n) {
// if (LMin[i] < RMax[j]) {
// // valid pair -> try to increase j for a larger gap
// maxDiff = Math.max(maxDiff, j - i);
// j++;
// } else {
// // need a smaller left value -> move i
// i++;
// }
// }
// return maxDiff;
// }
// }
