package Arrays;

public class Maximum_Absolute_Sum_of_Any_Subarray_1749 {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = 0;
        int positiveSumTillNow = 0, negSumTillNow = 0;
        int res = 0;

        // Rum kadane algo twice, one for max sum and one for min sum.
        for (int i = 0; i < nums.length; i++) {
            positiveSumTillNow+=nums[i];
            maxSum = Math.max(maxSum, positiveSumTillNow);
            if (positiveSumTillNow < 0) {
                positiveSumTillNow = 0;
            }

            negSumTillNow += nums[i];
            minSum = Math.min(minSum, negSumTillNow);
            if(negSumTillNow > 0) {
                negSumTillNow = 0;
            }

            res = Math.max(maxSum, -minSum);
        }
        return res;
    }
}
