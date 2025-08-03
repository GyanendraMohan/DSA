public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10,10,10};
        int n = arr.length;
        removeDuplicate(arr, n);
    }
    
    public static void removeDuplicate(int[] arr, int size) {
        int[] temp = new int[size];
        temp[0] = arr[0];
        int res = 1;
        for(int i = 1; i<size; i++){
            if(temp[res - 1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i = 0; i<res; i++){
            System.out.println(temp[i]);
        }
    }
}
