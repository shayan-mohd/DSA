package Arrays;

public class Container_With_Most_Water_11 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int area = 0;

        while (i < j) {
            area = Math.max(area, (j - i )* Math.min(height[i], height[j]));

            if (height[i] < height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return area;
    }
}
