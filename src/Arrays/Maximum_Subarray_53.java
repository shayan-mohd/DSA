package Arrays;

public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sumTillNow = 0;

        for(int i = 0; i < nums.length; i++) {
            sumTillNow += nums[i];
            maxSum = Math.max(maxSum, sumTillNow);
            if (sumTillNow < 0){
                sumTillNow = 0;
            }
        }
        return  maxSum;
    }
}
