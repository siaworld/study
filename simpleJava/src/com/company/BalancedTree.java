package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class BalancedTree {

    public static int checkHeight(TreeNode root){
        if(root == null)return 0;

        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1) return -1;
        int rightHeight = checkHeight(root.right);
        if(rightHeight ==-1) return -1;

        int heightDiff = leftHeight - rightHeight;
        if(Math.abs(heightDiff)>1)
            return -1;
        else
            return Math.max(leftHeight, rightHeight+1);
    }
    public boolean isBalanced(TreeNode root){
        if(checkHeight(root) == -1)
            return false;
        else
            return true;
    }
    boolean checkBST(TreeNode n){

        return checkBST(n, null, null);
    }
    boolean checkBST(TreeNode n, Integer min, Integer max){
        if(n==null)
            return true;

        if((min!= null && n.val <=min) || (max !=null && n.val> max))
            return false;

        if((!checkBST(n.left, min, n.val)) || (!checkBST(n.right, n.val, max)))
            return false;

        return true;

    }

    TreeNode inorderSucc(TreeNode n){
        if(n==null) return null;

        if(n.right != null)
            return leftMostChild(n.right);
        else
        {
            TreeNode q = n;
            TreeNode x =q.parent;
            while(x !=null && x.left !=q){
                q=x;
                x = x.parent;
            }
            return x;
        }
    }
    TreeNode leftMostChild(TreeNode n){
        if(n== null)
            return null;
        while(n.left !=null){
            n=n.left;
        }
        return n;

    }
    boolean contaisTree(TreeNode t1, TreeNode t2){
        if(t2==null)return true;

        return subTree(t1, t2) ;
    }

    boolean subTree(TreeNode r1, TreeNode r2){
        if(r1==null)
            return false;
        if (r1.val== r2.val){
            if(matchTree(r1, r2)) return true;

        }
        return (subTree(r1.left, r2) || subTree(r1.right, r2));
    }
    boolean matchTree(TreeNode r1, TreeNode r2){
        if(r2==null && r1== null) return true;

        if(r1 ==null || r2== null){
            return false;
        }

        if(r1.val != r2.val)
            return false;

        return (matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right));

    }

}

class TreeNode{
    int val;
    TreeNode parent;
    TreeNode left;
    TreeNode right;
}
