public class MaximumCircularSubArraySum {
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = { 5, -2, 3, 4 };
        System.out.println("Array: [5, -2, 3, 4]");
        System.out.println("Maximum Circular SubArray Sum: " + maximumCircularSubArraySum(arr1, arr1.length));

        // Test case 2: All positive
        int[] arr2 = { 1, 2, 3, 4 };
        System.out.println("\nArray: [1, 2, 3, 4]");
        System.out.println("Maximum Circular SubArray Sum: " + maximumCircularSubArraySum(arr2, arr2.length));

        // Test case 3: Mixed with negative
        int[] arr3 = { 8, -1, 3, 4 };
        System.out.println("\nArray: [8, -1, 3, 4]");
        System.out.println("Maximum Circular SubArray Sum: " + maximumCircularSubArraySum(arr3, arr3.length));
    }

    public static int maximumCircularSubArraySum(int[] arr, int n) {
        int maxSum = arr[0];

        // Try all possible starting positions
        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            // Try all possible subarray lengths from this starting position
            for (int j = 0; j < n; j++) {
                int index = (i + j) % n; // Circular indexing
                currentSum += arr[index];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
