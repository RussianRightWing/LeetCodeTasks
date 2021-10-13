package E965_Univalued_Binary_Tree;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }


     //Definition for a binary tree node.
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
        public boolean isUnivalTree(TreeNode root) {
            return checkNode(root, root.val);
        }

        private boolean checkNode(TreeNode node, int trueVal) {
            if (node.left != null) {
                if (!checkNode(node.left, trueVal))
                    return false;
            }

            if (node.right != null) {
                if (!checkNode(node.right, trueVal))
                    return false;
            }

            return node.val == trueVal;

        }
    }
}
