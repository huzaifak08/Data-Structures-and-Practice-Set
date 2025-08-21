import java.util.ArrayList;
import java.util.List;

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
    static TreeNode prev = null;
    static List<Integer> integerList = new ArrayList<Integer>();

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

    // Check if the tree is Binary search tree:
    public static boolean isBST(TreeNode root) {
        if (root != null) {
            if (!isBST(root.left)) {
                System.out.println("root.left");
                return false;
            }

            if (prev != null && root.data <= prev.data) {
                System.out.println("root.data");
                return false;
            }

            prev = root;

            if (!isBST(root.right)) {
                System.out.println("root.right");
                return false;
            }
        }
        return true;
    }

    // Check for element in BST:
    static TreeNode searchElementInBST(TreeNode root, int val){

        if(root != null){
            if(root.data == val){
                return root;
            }

            if(root.data > val){
                return searchElementInBST(root.left,val);
            }else{
                return searchElementInBST(root.right,val);
            }
        }else{
            return null;
        }
    }

    static TreeNode iterativeSearch(TreeNode root, int val){
        while (root != null){
            if(root.data == val){
                return root;
            }

            if(val > root.data){
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return null;
    }
    
    static void insertionInBST(TreeNode root, int val){
        TreeNode prev = null;
        
        while (root != null){
            prev = root;
            if(root.data == val){
                System.out.println("Element already in BST");
                return;
            } else if (val < root.data) {
                root = root.left;
            }else{
                root = root.right;
            }
        }

        TreeNode newNode = new TreeNode(val);

        if(val < prev.data){
            prev.left = newNode;
        }else{
            prev.right = newNode;
        }
    }

    static TreeNode inOrderSuccessor(TreeNode root,int val){
        TreeNode target = searchElementInBST(root,val);

        if(target.right != null){
            TreeNode current = target.right;
            if(current.left != null){
                return current.left;
            }
            return current;
        }

        TreeNode successor = null;
        TreeNode current = root;

        while (current != null){
            if(val < current.data){
                successor = current;
                current = current.left;
            }else if(val > current.data){
                current = current.right;
            }else{
                break;
            }
        }
        return successor;
    }

    static TreeNode inOrderPredecessor(TreeNode root, int val){
        TreeNode target = searchElementInBST(root,val);

        if(target.left != null){
            TreeNode current = target.left;
            if(current.right != null){
                return current.right;
            }
            return current;
        }

        TreeNode predecessor = null;
        TreeNode current = root;

        // Either handle the match state in while condition or in inside else condition (as in successor)
        while (current != null && current.data != target.data){
            if(current.data < val){
                predecessor = current;
                current = current.right;
            }else if(current.data > val){
                current = current.left;
            }
        }
        return predecessor;
    }

    static TreeNode deleteFromBST(TreeNode root, int val){
        if(root == null){
            return null;
        }

        if(val < root.data){
         root.left = deleteFromBST(root.left,val);
        } else if (val > root.data) {
           root.right = deleteFromBST(root.right,val);
        }else{
            // Found the node to delete:
            // Case 1: No child
            if(root.left == null && root.right == null){
                return null;
            }

            // Case 2: One child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            // Case 3: two Children
            TreeNode predecessor = root.left;
            while (predecessor.right != null) predecessor = predecessor.right;

            root.data = predecessor.data;
            root.left = deleteFromBST(root.left,predecessor.data);
        }
        return root;
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

//        preOrderTraversal(root);

//        System.out.println();
//        postOrderTraversal(root);

//        System.out.println();
//        inOrderTraversal(root);
//
//        System.out.println();
//       Boolean result = isBST(root);
//        System.out.println(result);

//        System.out.println("Searching Element in BST:");
//        TreeNode elem = searchElementInBST(root, 1);
//        System.out.println("Element Found: "+elem.data);

//        insertionInBST(root,7);

//        System.out.println("Iterative Searching in BST:");
//        TreeNode element = searchElementInBST(root, 7);
//        System.out.println("Element Found: "+element.data);

//        TreeNode successor = inOrderSuccessor(root, 4);
//        System.out.println("In order successor is: "+successor.data);
//
//        TreeNode predecessor = inOrderPredecessor(root, 4);
//        System.out.println("In order predecessor is: "+predecessor.data);

//        deleteFromBST(root,4);

//        System.out.println("After Deletion: ");
//        inOrderTraversal(root);

    }
}