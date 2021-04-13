package Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

public class App_22_1 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(0, 0, n, "", result);
        return result;
    }

    public static void dfs(int left, int right, int n, String s, List<String> result){
        if(left == n && right == n){
            result.add(s);
            return;
        }

        if(left < n){
            dfs(left + 1, right, n, s + "(", result);
        }

        if(right < n && right < left){
            dfs(left, right + 1, n, s + ")", result);
        }
    }
}
