// its a reverse inorder solution
class Solution {
    static int sum;
    public void reverseinorder(TreeNode root){
        if(root==null) return;
        reverseinorder(root.right);
        root.val+=sum;
        sum=root.val;
        reverseinorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        reverseinorder(root);
        return root;
        
    }
}

// both are solution 
// class Solution {
//     public void inorder(TreeNode root,List<TreeNode> ans){
//         if(root==null) return;
//         inorder(root.left,ans);
//         ans.add(root);
//         inorder(root.right,ans);
//     }
//     public TreeNode bstToGst(TreeNode root) {
//         List<TreeNode> ans = new ArrayList<>();
//         inorder(root,ans);
//         int n = ans.size();
//         for(int i=n-2;i>=0;i--){
//             ans.get(i).val+=ans.get(i+1).val;
//         }
//         return root;
        
//     }
// }