public class LeaderInArrayEfficient {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 10, 6, 5, 2 };
        int size = arr.length;
        leadersInArray(arr, size);
    }

    public static void leadersInArray(int[] arr, int size) {
        int currentLeader = arr[size - 1];
        System.out.println(currentLeader);
        for (int i = size - 2; i >= 0; i--) {
            if (currentLeader < arr[i]) {
                currentLeader = arr[i];
                System.out.println(currentLeader);
            }
        }
    }
}
