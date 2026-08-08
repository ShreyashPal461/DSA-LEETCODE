
class Solution {
    static boolean ans;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevels=levels(root.left);
        int rightlevels=levels(root.right);
        int diff = Math.abs(leftlevels-rightlevels);
        if(diff>1) ans=false;
        return 1 + Math.max(leftlevels,rightlevels);
    }
    public boolean isBalanced(TreeNode root) {
        ans=true;
        levels(root);
        return ans;

        
    }
}