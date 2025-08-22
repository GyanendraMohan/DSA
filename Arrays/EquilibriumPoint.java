public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, -9, 20, 6 };
        boolean res = equilibriumPoint(arr);
        System.out.println(res);
    }

    public static boolean equilibriumPoint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}
