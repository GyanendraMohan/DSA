public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int size = arr.length;
        int maxWater = maxArea(arr, size);
        System.out.println("Maximum water that can be stored is: " + maxWater);
    }

    public static int maxArea(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return 0;
        }
        int left = 0;
        int right = size - 1;
        int maxArea = 0;
        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
