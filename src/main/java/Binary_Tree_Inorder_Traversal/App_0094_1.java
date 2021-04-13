package Binary_Tree_Inorder_Traversal;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class App_0094_1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }
}
