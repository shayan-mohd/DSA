package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Merge_intervals_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length ; i++) {
            if (prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(intervals[i][1], prev[1]);
            }
            else {
                res.add(prev);
                prev = intervals[i];
            }
        }
        res.add(prev);
        return res.toArray(new int[res.size()][]);
    }
}
