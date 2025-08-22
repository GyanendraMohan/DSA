public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 5, 6, 3, 3, 3 };
        int size = arr.length;
        System.out.println("Input array: " + java.util.Arrays.toString(arr));
        System.out.println("Array length: " + size);
        System.out.println("Majority threshold: > " + size / 2 + " occurrences\n");

        int result = majorityElement(arr, size);
        System.out.println("\nFinal Result: " + result);
    }

    public static int majorityElement(int[] arr, int n) {
        if (arr == null || n == 0) {
            return -1;
        }
        if (n == 1) {
            return arr[0];
        }

        System.out.println("=== PHASE 1: Finding Candidate ===");
        int count = 0;
        int candidate = arr[0];
        System.out.println("Initial candidate: " + candidate + ", count: " + count);

        for (int i = 0; i < n; i++) {
            System.out.print("Step " + (i + 1) + ": arr[" + i + "] = " + arr[i]);

            if (count == 0) {
                candidate = arr[i];
                count = 1;
                System.out.println(" → New candidate: " + candidate + " (count reset to 1)");
            } else if (arr[i] == candidate) {
                count++;
                System.out.println(" → Same as candidate, count++ = " + count);
            } else {
                count--;
                System.out.println(" → Different from candidate, count-- = " + count);
            }
        }

        System.out.println("\n=== PHASE 2: Verifying Candidate ===");
        System.out.println("Potential candidate: " + candidate);
        count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
                System.out.println("arr[" + i + "] = " + arr[i] + " matches candidate → count = " + count);
            } else {
                System.out.println("arr[" + i + "] = " + arr[i] + " doesn't match candidate → count = " + count);
            }
        }

        System.out.println("\nFinal count for candidate " + candidate + ": " + count);
        System.out.println("Required for majority: > " + n / 2 + " (" + (n / 2 + 1) + ")");

        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
