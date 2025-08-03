public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 2, 5 };
        int maxWater = trap(arr);
        System.out.println("Water trapped: " + maxWater);

        // Test edge cases
        System.out.println("Empty array: " + trap(new int[] {}));
        System.out.println("Single element: " + trap(new int[] { 5 }));
        System.out.println("All same values: " + trap(new int[] { 3, 3, 3, 3 }));
        System.out.println("No trapping possible: " + trap(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println("Descending then ascending: " + trap(new int[] { 5, 4, 3, 2, 1, 2, 3, 4, 5 }));
    }

    public static int trap(int[] height) {
        // Edge case: empty array or single element
        if (height == null || height.length < 3) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}
