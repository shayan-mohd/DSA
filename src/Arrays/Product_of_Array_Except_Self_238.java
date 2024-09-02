package Arrays;

import java.util.Arrays;

public class Product_of_Array_Except_Self_238 {
    public int[] productExceptSelf(int[] nums) {
        int frontProd = 1, backProd = 1;

        int i = 0, j = nums.length - 1;
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        while (i < nums.length) {
            res[i] *= frontProd;
            frontProd *= nums[i];

            res[nums.length - i - 1] *= backProd;
            backProd *= nums[nums.length - i -1];
            i++;
        }
        return res;
    }
}
