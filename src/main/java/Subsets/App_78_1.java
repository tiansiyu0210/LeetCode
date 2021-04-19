package Subsets;

import java.util.ArrayList;
import java.util.List;

public class App_78_1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, nums.length, new ArrayList<>(), result);
        return result;
    }

    public void dfs(int[] nums, int cur, int n, List<Integer> list, List<List<Integer>> result){
        result.add(new ArrayList<>(list));

        for(int i = cur; i < n; i++){
            list.add(nums[i]);
            dfs(nums, i + 1, n, list, result);
            list.remove(list.size() - 1);
        }
    }
}
