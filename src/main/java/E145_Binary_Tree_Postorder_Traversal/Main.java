package E145_Binary_Tree_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root != null)
                reverseTraversal(root, res);
            return res;
        }

        private void reverseTraversal (TreeNode root, List<Integer> res) {
            if (root.left != null)
                reverseTraversal(root.left, res);
            if (root.right != null)
                reverseTraversal(root.right, res);
            res.add(root.val);
        }
    }
}
