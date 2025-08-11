public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        int size = arr.length;
        int sum = 5;
        boolean res = subArrayWithGivenSum(arr, size, sum);
        System.out.println(res);
    }

    public static boolean subArrayWithGivenSum(int[] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}
