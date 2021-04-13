package Container_With_Most_Water;


//https://leetcode.com/problems/container-with-most-water/
public class App1 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int max = 0;
        for(int i = 0, j = height.length - 1; i < j;){
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            max = Math.max(h * w, max);

            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }

        return max;
    }
}
