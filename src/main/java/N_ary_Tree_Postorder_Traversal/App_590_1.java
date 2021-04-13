package N_ary_Tree_Postorder_Traversal;



import Util.Node;

import java.util.ArrayList;
import java.util.List;

public class App_590_1 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(Node root, List<Integer> list){
        if(root == null){
            return;
        }

        for(Node tree : root.children){
            dfs(tree, list);
        }

        list.add(root.val);
    }
}
