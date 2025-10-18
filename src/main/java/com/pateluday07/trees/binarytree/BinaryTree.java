package com.pateluday07.trees.binarytree;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public String inorderTraversalRecursive(Node root) {
        StringBuilder builder = new StringBuilder();
        inorderTraversalRecursive(root, builder);
        return builder.toString().trim();
    }

    private void inorderTraversalRecursive(Node node, StringBuilder builder) {
        if(node == null)
            return;

        inorderTraversalRecursive(node.getLeftChild(), builder);
        builder.append(node.getValue()).append(" ");
        inorderTraversalRecursive(node.getRightChild(), builder);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
