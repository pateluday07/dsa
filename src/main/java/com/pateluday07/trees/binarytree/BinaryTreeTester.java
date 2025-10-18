package com.pateluday07.trees.binarytree;

public class BinaryTreeTester {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        root.setLeftChild(two);
        root.setRightChild(three);

        Node four = new Node(4);
        Node five = new Node(5);
        two.setLeftChild(four);
        two.setRightChild(five);

        Node six = new Node(6);
        Node seven = new Node(7);
        three.setLeftChild(six);
        three.setRightChild(seven);

        Node eight = new Node(8);
        Node nine = new Node(9);
        five.setLeftChild(eight);
        five.setRightChild(nine);

        BinaryTree tree = new BinaryTree(root);
        System.out.println("Inorder recursive traversal: " + tree.inorderTraversalRecursive(root));
    }
}
