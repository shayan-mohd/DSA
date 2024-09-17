package Arrays;

public class Find_Minimum_Rotated_Sorted_Array_153 {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] > nums[high]) {
                low = mid + 1;
            }
            else {
                ans = Math.min(ans, nums[mid]);
                high = mid -1;
            }
        }
        return ans;
    }
}
