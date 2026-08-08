class Solution {
    static int maxDia;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        int dia = leftlevels + rightlevels;
        maxDia = Math.max(dia,maxDia);
        return 1 + Math.max(leftlevels,rightlevels);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDia=0;
        levels(root);
        return maxDia;
        
    }
}