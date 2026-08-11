class Solution {
    private int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right)); 
    }
    private void nThLevel(TreeNode root, int level,int lvl,List<Integer> arr){
        if(root==null) return;
        if(level>lvl) return;
        if(level==lvl) arr.add(root.val);
        nThLevel(root.left,level+1,lvl,arr);
        nThLevel(root.right,level+1,lvl,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i=0;i<=lvl-1;i++){
        List<Integer> arr = new ArrayList<>();
        nThLevel(root,0,i,arr);
        ans.add(arr);
        }
        return ans;
        
    }
}


// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         if (root == null) {
//             return ans;
//         }
//         Queue<TreeNode> q = new LinkedList<>();
//         q.offer(root);

//         while (!q.isEmpty()) {

//             int size = q.size();
//             List<Integer> level = new ArrayList<>();

//             for (int i = 0; i < size; i++) {

//                 TreeNode node = q.poll();
//                 level.(node.vaddal);

//                 if (node.left != null) {
//                     q.offer(node.left);
//                 }

//                 if (node.right != null) {
//                     q.offer(node.right);
//                 }
//             }

//             ans.add(level);
//         }

//         return ans;
//     }
// }