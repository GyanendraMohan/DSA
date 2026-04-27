package Searching;

public class SerachSortedRotatedArray {
    public static void main(String[] args) {
        int [] nums = {10, 20, 30 , 40, 50, 8, 9};
        int res = search(nums, 8);
        System.out.println(res);
    }
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high) {
            int mid = (low + (high - low)/2);
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[low] <= nums[mid]) {
                if(target >= nums[low] && target < nums[mid]) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else {
                if(target > nums[mid] && target <= nums[high]) {
                    low = mid+1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
