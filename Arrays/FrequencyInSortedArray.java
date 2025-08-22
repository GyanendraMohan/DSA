/**
 * Count frequency of elements in a sorted array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 3, 3, 5, 5, 10, 10 };
        // int[] arr = { 2, 2, 2, 2 };
        int size = arr.length;
        frequencyCount(arr, size);
    }

    /**
     * Count and print frequency of each element in sorted array
     * 
     * Algorithm:
     * 1. Start with count = 1 for first element
     * 2. Compare current element with next element
     * 3. If same, increment count
     * 4. If different, print frequency and reset count
     * 5. Handle last element separately
     */
    public static void frequencyCount(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int count = 1; // Start with count 1 for first element

        // Loop through array except last element
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++; // Same element, increment count
            } else {
                // Different element, print frequency of previous element
                System.out.println(arr[i] + " appears " + count + " times");
                count = 1; // Reset count for new element
            }
        }

        // Handle the last element
        System.out.println(arr[size - 1] + " appears " + count + " times");
    }
}
