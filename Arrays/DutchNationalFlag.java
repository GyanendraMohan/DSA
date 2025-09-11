public class DutchNationalFlag {
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = { 2, 0, 2, 1, 1, 0 };
        int[] nums2 = { 2, 0, 1 };
        int[] nums3 = { 1, 0, 2, 1, 0, 2, 1, 0 };

        System.out.println("Original array 1: " + java.util.Arrays.toString(nums1));
        sortColors(nums1);
        System.out.println("Sorted array 1: " + java.util.Arrays.toString(nums1));

        System.out.println("\nOriginal array 2: " + java.util.Arrays.toString(nums2));
        sortColors(nums2);
        System.out.println("Sorted array 2: " + java.util.Arrays.toString(nums2));

        System.out.println("\nOriginal array 3: " + java.util.Arrays.toString(nums3));
        sortColors(nums3);
        System.out.println("Sorted array 3: " + java.util.Arrays.toString(nums3));
    }

    /**
     * Dutch National Flag Algorithm
     * Sorts array in-place with 0s, 1s, and 2s
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void sortColors(int[] nums) {
        int low = 0; // Points to the end of 0s section
        int mid = 0; // Current element being processed
        int high = nums.length - 1; // Points to the start of 2s section

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap with low pointer and move both pointers
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is in correct position, just move mid pointer
                mid++;
            } else { // nums[mid] == 2
                // Swap with high pointer and move high pointer
                swap(nums, mid, high);
                high--;
                // Don't move mid pointer as we need to check the swapped element
            }
        }
    }

    /**
     * Helper method to swap elements in array
     */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * Alternative approach using counting sort
     * Time Complexity: O(n)
     * Space Complexity: O(1) - only uses constant extra space
     */
    public static void sortColorsCounting(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count occurrences of each color
        for (int num : nums) {
            if (num == 0)
                count0++;
            else if (num == 1)
                count1++;
            else
                count2++;
        }

        // Reconstruct the array
        int index = 0;
        for (int i = 0; i < count0; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            nums[index++] = 2;
        }
    }
}
