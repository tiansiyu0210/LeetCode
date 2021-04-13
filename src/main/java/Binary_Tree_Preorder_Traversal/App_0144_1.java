package Binary_Tree_Preorder_Traversal;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class App_0144_1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode tree, List<Integer> list){
        if( tree == null ){
            return;
        }

        list.add(tree.val);
        dfs(tree.left, list);
        dfs(tree.right, list);
    }
}
