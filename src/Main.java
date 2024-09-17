public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
    }

    public static int firstMissingPositive(int[] nums) {
        int[] arr = new int[10000];

        for(int x : nums) {
            if(x > 0){
                arr[x] = 1;
            }
        }
        int ans = 0;

        for(int i =1; i < arr.length; i++){
            if(arr[i] == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}