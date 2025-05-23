public class MinDiffInBST {
    /*
    Учитывая root двоичное дерево поиска (BST),
    вернуть минимальную разницу между значениями любых двух различных узлов в дереве.
     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int minDiffInBST(TreeNode root) {
        int dif = root.val - root.left.val;
        TreeNode current = root;
        while(current != null){
            dif = (root.val - root.left.val) < dif ? (root.val - root.left.val) : dif;
            current = current.left;
        }
        current = current.right;
        return dif;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(6), new TreeNode(1)), new TreeNode(3));
        System.out.println(minDiffInBST(root));
    }
}