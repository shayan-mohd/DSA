package Arrays;

public class H_index_II_275 {
    public int hIndex(int[] citations) {
        int low = 0, high = citations.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if (citations[mid] == citations.length - mid) {
                return citations.length - mid;
            }
            else if (citations[mid] > citations.length - mid) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return citations.length - low;
    }
}
