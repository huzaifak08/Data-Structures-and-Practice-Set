class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class tree_linked {

    public static void preOrderTraversal(TreeNode root ){
        if(root != null){
            System.out.print(root.data + ",");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + ",");
        }
    }

    public static void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + ",");
            inOrderTraversal(root.right);
        }
    }


    public static void main(String[] args){

        //      4
        //     / \
        //    1   6
        //   / \
        //  5   2

        TreeNode root = new TreeNode(4);
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(6);
        TreeNode p3 = new TreeNode(5);
        TreeNode p4 = new TreeNode(2);

        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;

        preOrderTraversal(root);

        System.out.println();
        postOrderTraversal(root);

        System.out.println();
        inOrderTraversal(root);

    }
}
