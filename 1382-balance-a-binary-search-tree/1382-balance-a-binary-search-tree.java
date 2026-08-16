class Solution {
    List<Integer> list = new ArrayList<>();
    // apply inorder
    public void inorder(TreeNode root){  
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    // for balancing
    public TreeNode build(int lo,int hi){
        if(lo>hi) return null;
        int mid=lo+(hi-lo)/2;
        TreeNode root= new TreeNode(list.get(mid));
        root.left=build(lo,mid-1);
        root.right=build(mid+1,hi);
        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0,list.size()-1);

        
    }
}