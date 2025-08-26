package com.pateluday07.arrays.binarysearch;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 13;

        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        System.out.println("Found: " + binarySearchRecursive.search(sortedArray, target) + "\n\n");

        int[] reverseSortedArray = {15, 13, 11, 9, 7, 5, 3, 1};
        target = 11;
        BinarySearchIterative binarySearchIterative = new BinarySearchIterative();
        System.out.println("Found: " + binarySearchIterative.search(reverseSortedArray, target));

    }
}
