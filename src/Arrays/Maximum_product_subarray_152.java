package Arrays;

public class Maximum_product_subarray_152 {

    public int maxProduct1(int[] nums) {
        int result = nums[0], min = nums[0] ,max = nums[0];

        for(int i = 1; i< nums.length; i++){
            if(nums[i] < 0) {
                int temp = min;
                min = max;
                max = temp;
            }
            max = Math.max(max* nums[i], nums[i]);
            min = Math.min(min* nums[i], nums[i]);
            result = Math.max(max, result);
        }
        return result;
    }

    public int maxProduct2(int[] nums) {
        int prodLeft = 1, prodRight = 1, n = nums.length;
        int maxRight = -11, maxLeft = -11;

        for(int i = 0; i< nums.length; i++) {
            prodLeft*= nums[i];
            maxLeft = Math.max(prodLeft, maxLeft);

            prodRight *= nums[n - i -1];
            maxRight = Math.max(prodRight, maxRight);

            if (nums[i] == 0) {
                prodLeft = 1;
            }
            if (nums[n - i - 1] == 0) {
                prodRight = 1;
            }
        }
        return Math.max(maxRight, maxLeft);
    }
}
