/**
 * MaximumConsecutiveOnes - Algorithm to find the maximum number of consecutive
 * 1s in a binary array
 * 
 * Problem: Given a binary array (containing only 0s and 1s), find the maximum
 * number
 * of consecutive 1s in the array.
 * 
 * Example:
 * Input: [0, 1, 1, 0, 1, 1, 1, 1]
 * Output: 4 (consecutive 1s from index 4 to 7)
 * 
 * Time Complexity: O(n²) - Brute force approach
 * Space Complexity: O(1) - Constant extra space
 * 
 * @author Gyanendra Mohan Patel
 * @version 1.0
 */
public class MaximumConsecutiveOnes {

    /**
     * Main method to demonstrate the algorithm
     * Creates a test array and calls the counting function
     */
    public static void main(String[] args) {
        // Test array with binary values (0s and 1s)
        int[] arr = { 0, 1, 1, 0, 1, 1, 1, 1 };
        int size = arr.length;

        // Call the function to find maximum consecutive 1s
        int countOnes = countConsucutiveOnes(arr, size);

        // Print the result
        System.out.println("Maximum consecutive 1s: " + countOnes);
    }

    /**
     * Finds the maximum number of consecutive 1s in a binary array
     * 
     * Algorithm:
     * 1. For each position in the array, count consecutive 1s starting from that
     * position
     * 2. Stop counting when we encounter a 0 or reach the end of array
     * 3. Keep track of the maximum count found so far
     * 
     * @param arr The binary array containing 0s and 1s
     * @param n   The length of the array
     * @return The maximum number of consecutive 1s
     */
    public static int countConsucutiveOnes(int[] arr, int n) {
        // Variable to store the maximum count of consecutive 1s found so far
        int count = 0;

        // Iterate through each position as a potential starting point
        for (int i = 0; i < n; i++) {
            // Counter for consecutive 1s starting from current position
            int currentCount = 0;

            // Count consecutive 1s starting from position i
            for (int j = i; j < n; j++) {
                if (arr[j] == 1) {
                    // If we find a 1, increment the current count
                    currentCount++;
                } else {
                    // If we find a 0, break the counting for this starting position
                    break;
                }
            }

            // Update the maximum count if current count is greater
            count = Math.max(currentCount, count);
        }

        // Return the maximum count of consecutive 1s
        return count;
    }
}
