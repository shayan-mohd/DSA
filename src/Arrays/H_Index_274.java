package Arrays;

public class H_Index_274 {
    public int hIndex(int[] citations) {
        int[] bucket = new int[citations.length + 1];

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <= citations.length)
            {
                bucket[citations[i]]++;
            }
            else {
                bucket[citations.length]++;
            }
        }

        int count = 0;
        for (int i = citations.length; i >= 0; i--) {
            count+=bucket[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }
}
