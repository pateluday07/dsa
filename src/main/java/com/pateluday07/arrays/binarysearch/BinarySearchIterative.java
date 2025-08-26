package com.pateluday07.arrays.binarysearch;

public class BinarySearchIterative {

    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int midIndex = low + (high - low) / 2;
            if (arr[midIndex] == target)
                return true;
            else if (arr[midIndex] > target)
                low = midIndex + 1;
            else
                high = midIndex - 1;
        }

        return false;
    }
}
