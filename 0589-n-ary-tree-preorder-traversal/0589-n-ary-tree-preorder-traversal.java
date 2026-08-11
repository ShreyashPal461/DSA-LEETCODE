class Solution {

    static void dfs(Node root, List<Integer> ans) {

        if (root == null) {
            return;
        }

        ans.add(root.val);

        for (Node child : root.children) {
            dfs(child, ans);
        }
    }

    public List<Integer> preorder(Node root) {

        List<Integer> ans = new ArrayList<>();

        dfs(root, ans);

        return ans;
    }
}