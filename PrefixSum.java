public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 3, 9, 6, 5, 4 };
        int[] prefix = prefixSum(arr);
        for (int i : prefix) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return new int[0];
        int[] sum = new int[n]; // Fix: initialize with correct length
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        return sum;
    }
}
