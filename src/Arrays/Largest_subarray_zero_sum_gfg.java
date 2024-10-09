package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Largest_subarray_zero_sum_gfg {
    int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int prefixSum = 0, maxLength = 0;

        for(int i = 0 ; i< arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }

            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            }
            else {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
