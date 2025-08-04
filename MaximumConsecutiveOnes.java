public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 1, 1, 1 };
        int size = arr.length;
        int countOnes = countConsucutiveOnes(arr, size);
        System.out.println(countOnes);
    }

    public static int countConsucutiveOnes(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int currentCount = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 1) {
                    currentCount++;
                } else
                    break;
            }
            count = Math.max(currentCount, count);
        }
        return count;
    }
}
