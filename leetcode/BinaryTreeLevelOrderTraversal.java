/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> l = new ArrayList<List<Integer>>();

        if (root == null)
            return l;

        q.add(root);

        while (!q.isEmpty()) {
            ArrayList<Integer> al = new ArrayList<>();
            int sz = q.size();

            while (sz > 0) {
                TreeNode node = q.poll();
                if (node != null) {
                    al.add(node.val);
                    if (node.left != null)
                        q.add(node.left);
                    if (node.right != null)
                        q.add(node.right);
                }
                sz--;
            }
            l.add(al);
        }
        return l;
    }
}