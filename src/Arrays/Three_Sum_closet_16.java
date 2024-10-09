package Arrays;

import java.util.Arrays;
public class Three_Sum_closet_16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minAbsdist = Integer.MAX_VALUE, n = nums.length;
        int closestSum = 0;

        for(int i = 0; i< n; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (minAbsdist > Math.abs(target - sum)) {
                    closestSum = sum;
                    minAbsdist = Math.abs(target - sum);
                }
                if (sum > target) {
                    k--;
                }
                else if (sum < target) {
                    j++;
                }
                else {
                    return sum;
                }
            }
        }
        return closestSum;
    }
}
