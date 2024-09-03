package Arrays;

public class Sort_Colors_75 {
    public void sortColorsSolution1(int[] nums) {
        int zero = 0, one = 0, two = 0;

        for (int x: nums) {
            if (x == 0){
                zero++;
            }
            else if (x == 1) {
                one++;
            }
            else {
                two ++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zero > 0) {
                nums[i] = 0;
                zero--;
            }
            else if (zero <= 0 && one > 0) {
                nums[i] = 1;
                one--;
            }
            else if (zero <=0 && one <= 0 && two > 0) {
                nums[i] = 2;
                two--;
            }
        }
    }

    public void sortColorsSolution2(int[] nums) {
        int low = 0, mid = 0, high = nums.length -1 ;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(mid, high, nums);
                high--;
            }
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
