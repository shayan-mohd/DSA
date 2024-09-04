package Arrays;

public class Remove_duplicate_from_sorted_array_80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int j =2;
        for(int i =2; i < nums.length; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
