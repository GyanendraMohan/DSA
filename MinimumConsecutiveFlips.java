//minimum no of flips required to make all elements of binary array same.
public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1 };
        int size = arr.length;
        minNoOfFlips(arr, size);
    }

    public static void minNoOfFlips(int[] arr, int n) {
        int onesGroupCount = 0;
        int zerosGroupCount = 0;
        if (arr[0] == 1)
            onesGroupCount++;
        else
            zerosGroupCount++;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == 1)
                    onesGroupCount++;
                else
                    zerosGroupCount++;
            }
        }
        int flipValue = (zerosGroupCount < onesGroupCount) ? 0 : 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == flipValue) {
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.println((i - 1));
                }
            }
        }
        if (arr[n - 1] == flipValue) {
            System.out.println((n - 1));
        }
    }
}
