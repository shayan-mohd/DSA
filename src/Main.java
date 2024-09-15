public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // [4,5,6,7,0,1,2]
        int low  = 0;
        int high = 6;
        int mid  = 3;

        int target = 1;

        // low - mid - > 4567
        // mid - high -> 7012

        int[] nums = new int[]{4,5,6,7,0,1,2,3};
        System.out.println(search(nums, 4));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && nums[mid] >= target) {
                    high = mid - 1;
                }
                else {
                    low  = mid + 1;
                }
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}