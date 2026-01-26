public class ReverseSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int l = 2, r = 4;
        System.out.println("Input: arr = [1, 2, 3, 4, 5, 6, 7], l = 2, r = 4");
        reverseSubarray(arr, l, r);
        printArray(arr);
    }

    public static void reverseSubarray(int[] arr, int l, int r) {
        int left = l - 1;
        int right = r - 1;
        if (left < 0 || right >= arr.length || left > right) {
            return;
        }

        reverseHelper(arr, left, right);
    }

    private static void reverseHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseHelper(arr, left + 1, right - 1);
    }

    private static void printArray(int[] arr) {
        System.out.print("Output: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
