package Arrays;

public class Single_Element_In_aSorted_array_540 {

        public static int singleNonDuplicate(int[] nums) {
            int low = 0, high = nums.length -1;

            while(low < high) {
                int mid = low + (high - low)/2;

                // if (mid > 0 && mid < nums.length - 1 && nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1] ) {
                //     return nums[mid];
                // }
                // else
                if ((mid % 2 == 0 && nums[mid] == nums[mid+1]) ||
                        (mid % 2 != 0  && nums[mid] == nums[mid-1])) {
                    low = mid + 1;
                }
                else {
                    high = mid ;
                }
            }
            return nums[low];
        }

}
