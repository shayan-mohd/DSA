package Arrays;

import java.util.List;

public class Find_Kth_Rotation {
    //input
//    39 6 11 14 18 36 37 38
    //output : 1

    public int findKRotation(List<Integer> arr) {
        // Code here
        int low = 0, high = arr.size() - 1;

        while (low < high) {
            int mid  = low + (high - low)/2;
            if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            } else if(arr.get(low) > arr.get(mid)) {
                high = mid;
            }
            else {
                return low;
            }
        }
        return low;
    }
}
