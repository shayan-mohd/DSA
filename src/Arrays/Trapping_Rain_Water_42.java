package Arrays;

public class Trapping_Rain_Water_42 {
        public int trap(int[] height) {
            int[] hleft = new int[height.length];
            int[] hright = new int[height.length];

            int totalWater = 0;

            hleft[0] = height[0];
            for (int i = 1; i < height.length; i++) {
                hleft[i] = Math.max(hleft[i-1], height[i]);
            }

            hright[height.length - 1] = height[height.length - 1];
            for (int i = height.length - 2; i >= 0; i--) {
                hright[i] = Math.max(hright[i+1], height[i]);
            }

            for (int i = 0; i< height.length; i++) {
                totalWater += Math.min(hleft[i], hright[i]) - height[i];
            }
            return totalWater;
        }
    public int trap2(int[] height) {
        int l = 0, r = height.length - 1, lMax = height[0], rMax = height[height.length - 1];
        int totalWater = 0;

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                totalWater += lMax - height[l];
            }
            else {
                r--;
                rMax = Math.max(rMax, height[r]);
                totalWater += rMax - height[r];
            }
        }
        return totalWater;
    }
}
