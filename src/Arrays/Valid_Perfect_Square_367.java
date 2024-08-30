package Arrays;

public class Valid_Perfect_Square_367 {
    public boolean isPerfectSquare(int num) {
        int high = num, low = 1;

        while(high >= low){
            int mid = low + (high - low)/2;
            long  midSq = (long) mid * mid;
            if(midSq == num){
                return true;
            }
            else if(midSq > num){
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        return false;
    }
}
