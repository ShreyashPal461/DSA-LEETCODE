import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);

        while (!st.isEmpty()) {
            TreeNode top = st.pop();
            ans.add(top.val);

            if (top.left != null)
                st.push(top.left);

            if (top.right != null)
                st.push(top.right);
        }

        Collections.reverse(ans);

        return ans;
    }
}

// class Solution {
//     static void postorder(TreeNode root, List<Integer> ans){
//         if(root==null) return;
//         postorder(root.left,ans);
//         postorder(root.right,ans);
//         ans.add(root.val);
//     }
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         postorder(root,ans);
//         return ans;
        
//     }
// }
