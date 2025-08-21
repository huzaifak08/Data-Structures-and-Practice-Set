import java.util.ArrayList;
import java.util.List;

public class ps_94_inorder_traversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private static void inorderHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorderHelper(node.left, result);
            result.add(node.data);
            inorderHelper(node.right, result);
        }
    }

    public static void main(String[] args){

        //      5
        //     / \
        //    3   6
        //   / \
        //  1   4

        TreeNode root = new TreeNode(5);
        TreeNode p1 = new TreeNode(3);
        TreeNode p2 = new TreeNode(6);
        TreeNode p3 = new TreeNode(1);
        TreeNode p4 = new TreeNode(4);

        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;

        var result =  inorderTraversal(root);
        System.out.println(result);

    }
}
