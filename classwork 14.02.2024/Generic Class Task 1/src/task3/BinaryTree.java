package task3;

public class BinaryTree <T extends Comparable<T>> {
    private class TreeNode {
        T data;
        TreeNode left;
        TreeNode right;

        public TreeNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T data) {
        this.root = insertNode(root, data);
    }

    private TreeNode insertNode(TreeNode root, T data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data.compareTo(root.data) < 0) {
            root.left = insertNode(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    public boolean search(T data) {
        return searchNode(root, data);
    }

    private boolean searchNode(TreeNode root, T data) {
        if (root == null) {
            return false;
        }

        if (data.compareTo(root.data) == 0) {
            return true;
        } else if (data.compareTo(root.data) < 0) {
            return searchNode(root.left, data);
        } else {
            return searchNode(root.right, data);
        }
    }

    public void delete(T data) {
        this.root = deleteNode(root, data);
    }

    private TreeNode deleteNode(TreeNode root, T data) {
        if (root == null) {
            return null;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = deleteNode(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
}