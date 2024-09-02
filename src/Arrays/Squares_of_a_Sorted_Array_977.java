package Arrays;

public class Squares_of_a_Sorted_Array_977 {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1;
        int[] res = new int[nums.length];

        for(int k = 0; k < nums.length; k++) {
            nums[k] = nums[k] * nums[k];
        }

        int x = nums.length - 1;
        while (i <= j) {
            if (nums[i] > nums[j]) {
                res[x] = nums[i];
                i++;
            }
            else {
                res[x] = nums[j];
                j--;
            }
            x--;
        }
        return res;
    }
}
