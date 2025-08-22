public class OptimalEquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, -9, 20, 6 };
        boolean res = equilibriumPoint(arr);
        System.out.println(res);
    }

    public static boolean equilibriumPoint(int[] arr) {
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        // System.out.println(rightSum);
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return true;
            }
            leftSum += arr[i];
        }
        return false;
    }
}
