
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
//        System.out.println(firstMissingPositive(new int[]{1,2,0}));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for (int i = nums2.length -1;  i>=0 ; i++) {
            while (!s.empty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            if (s.empty()) {
                map.put(nums2[i], -1);
            }
            else {
                map.put(nums2[i], s.peek());
            }
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}