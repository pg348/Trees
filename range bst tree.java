// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }

        

         if(high<root.val){
            rangeSumBST(root.left,low,high);
        }
        if(root.val>=low && root.val<=high){
            rangeSumBST(root.left,low,high);
            sum=sum+root.val;
            rangeSumBST(root.right,low,high);
        }
        if(low>root.val){
            rangeSumBST(root.right,low,high);
        }

        return sum;
       
    }

    void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}