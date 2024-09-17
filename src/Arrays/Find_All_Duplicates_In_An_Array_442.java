package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_In_An_Array_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] < 0) {
                res.add(x);
            }
            nums[x - 1] *= -1;
        }
        return res;
    }
    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[nums[i] -1] && i != nums[i] - 1) {
                res.add(nums[i]);
            }
        }
        return res;
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
