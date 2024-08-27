import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    public boolean searchRec(TreeNode root, int key) {
        if (root == null || root.data == key)
            return root != null;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }
}

public class BALBIN_BSTSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Enter 10 integers to insert into the BST:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            bst.insert(num);
        }

        System.out.println("Enter a number to search in the BST:");
        int searchNum = scanner.nextInt();

        if (bst.search(searchNum)) {
            System.out.println(searchNum + " is present in the BST.");
        } else {
            System.out.println(searchNum + " is not present in the BST.");
        }
    }
}