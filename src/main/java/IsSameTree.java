public class IsSameTree {
    /*
    Даны корни двух двоичных деревьев pи q,
    напишите функцию, которая проверит, являются ли они одинаковыми или нет.
    Два бинарных дерева считаются одинаковыми, если они структурно идентичны,
    а узлы имеют одинаковое значение.
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }
       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);

        TreeNode q = new TreeNode(1, null, new TreeNode(2));

        System.out.println(isSameTree(p, q));
    }
}