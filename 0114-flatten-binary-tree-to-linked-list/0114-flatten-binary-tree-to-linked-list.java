/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list=new ArrayList<>();
    public void flatten(TreeNode root){
        if(root==null) return;
        Trav(root);
        TreeNode temp=root;
        int size=list.size();
        for(int i=1;i<size;++i){
            temp.right=new TreeNode(list.get(i));
            temp.left=null;
            temp=temp.right;
        }
    }
    public void Trav(TreeNode node){
        if(node==null) return;
        list.add(node.val);
        Trav(node.left);
        Trav(node.right);
    }
}