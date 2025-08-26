package com.pateluday07.arrays.binarysearch;

public class BinarySearchRecursive {

    public boolean search(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    private boolean search(int[] arr, int target, int low, int high) {
        if (low > high)
            return false;

        int midIndex = low + (high - low) / 2;

        if (arr[midIndex] == target)
            return true;
        else if (arr[midIndex] < target)
            return search(arr, target, midIndex + 1, high);
        else
            return search(arr, target, low, midIndex - 1);
    }
}
