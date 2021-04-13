package Move_Zeroes;

import Util.Print;

public class App1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,8,0,6, 2, 0, 0,5,4,8,3,7};
        moveZeroes(arr);
        Print.intArray(arr);
    }
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        //use i to scan the array
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[curr] = nums[i];
                if(i != curr){
                    nums[i] = 0;
                }
                curr++;
            }
        }
    }
}
