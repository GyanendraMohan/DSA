public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 10, 6, 5, 2 };
        int n = arr.length;
        leadersInArray(arr, n);
    }

    public static void leadersInArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Index at " + i + " element is " + arr[i] + " is Leader");
            }
        }
    }
}
