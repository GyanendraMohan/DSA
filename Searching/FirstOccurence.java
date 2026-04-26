package Searching;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {1,10,10,10,20,20,40};
        int size = arr.length;
        int key = 20;
        int result = firstOccurence(arr, size, key);
        if (result != -1) {
            System.out.println("index of first occurence of " + key + " is: " + result);
        } else {
            System.out.println(key+ "is not found in the array");
        }
    }

    public static int firstOccurence(int arr[], int size, int key) {
        int low = 0;
        int high = size - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1; 
            } else if (arr[mid] < key) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
            
        }
        return result;
    }
}
