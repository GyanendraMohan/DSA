/**
 * Efficient algorithm to move all zeros to the end of an array
 * while maintaining the relative order of non-zero elements
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - In-place algorithm, no extra space needed
 */
public class MoveZeroToEndEfficient {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };
        int n = arr.length;
        moveZeroToEnd(arr, n);
    }

    /**
     * Moves all zeros to the end while preserving order of non-zero elements
     * 
     * Algorithm:
     * 1. Use 'count' to track the next position for non-zero elements
     * 2. Iterate through array, when we find non-zero element:
     * - Swap it with element at 'count' position (only if i != count)
     * - Increment 'count' to move to next position
     * 3. This ensures all non-zeros are moved to front in order
     * 4. All zeros automatically end up at the end
     * 
     * @param arr  - Input array
     * @param size - Size of the array
     */
    public static void moveZeroToEnd(int[] arr, int size) {
        int count = 0; // track the count of non-zero elements

        // Single pass through array - O(n) time complexity
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                // Only swap if positions are different to avoid unnecessary operations
                if (i != count) {
                    swap(arr, i, count);
                }
                count++;
            }
        }

        // Print the result
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Swaps two elements in the array
     * Time Complexity: O(1)
     * 
     * @param arr - Array to swap elements in
     * @param i   - First index
     * @param j   - Second index
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
