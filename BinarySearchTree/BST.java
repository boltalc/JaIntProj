import java.util.*;

class TreeNode{
    int value;
    TreeNode left, right;

    TreeNode(int value){
        this.value = value;
        left = right = null;
    }
}

public class BST{

    static TreeNode root = null;

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int action;

        do{
            System.out.printf("\n1. Insert%n2. Delete%n3. Search%n4. Traversal%n0. Exit%nEnter your choice: ");
            action = in.nextInt();

            if(action == 1){
		System.out.print("Enter value to insert: ");
                int insertVal = in.nextInt();
                root = insert(root, insertVal);
                System.out.println("Inserted.");
	    }
            else if(action == 2){
                System.out.print("Enter value to delete: ");
                int deleteVal = in.nextInt();
                root = delete(root, deleteVal);
                System.out.println("Deleted");
	    }
            else if(action == 3){
                 System.out.print("Enter value to search: ");
                 int searchVal = in.nextInt();
                 if (search(root, searchVal)) {
		     System.out.println("Value found.");
                 } else {
		     System.out.println("Value not found.");
                 }
	    }

            else if(action == 4){
		System.out.println("\nIn-order Traversal:");
                inorder(root);

                System.out.println("\nPre-order Traversal:");
                preorder(root);

                System.out.println("\nPost-order Traversal:");
		postorder(root);
	    }
            else if(action == 0){
                System.out.println("Exiting...");
		System.exit(0);
            }

            else{
                System.out.println("Invalid choice.");
            }

        }while(action != 0);

        in.close();
    }

    static TreeNode insert(TreeNode root, int value){
        if(root == null){
            return new TreeNode(value);
        }

        if(value < root.value){
            root.left = insert(root.left, value);
        }else if (value > root.value){
            root.right = insert(root.right, value);
        }

        return root;
    }

    static boolean search(TreeNode root, int value){
        if(root == null){
	    return false;
	}
        if(value == root.value){
	    return true;
	}
        if(value < root.value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    static TreeNode delete(TreeNode root, int value){
        if(root == null){
	    return null;
	}
        if(value < root.value){
            root.left = delete(root.left, value);
        }else if (value > root.value){
            root.right = delete(root.right, value);
        }
	else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.value = minValue(root.right);
            root.right = delete(root.right, root.value);
        }

        return root;
    }

    static int minValue(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.value;
    }

    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    static void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
    }
}
