class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;

            }else{
                if(st.size()==0) break;
                TreeNode top = st.pop();
                ans.add(top.val);
                temp=top.right;
            }

        }
        return ans;
    }
}

// class Solution {
//     static void inorder(TreeNode root, List<Integer> ans){
//         if(root==null) return;
//         inorder(root.left,ans);
//         ans.add(root.val);
//         inorder(root.right,ans);

//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         inorder(root,ans);
//         return ans;
        
//     }
// }